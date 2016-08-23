package com.feed_the_beast.javacurselib.examples.app_v1;

import com.feed_the_beast.javacurselib.common.enums.DevicePlatform;
import com.feed_the_beast.javacurselib.data.Apis;
import com.feed_the_beast.javacurselib.rest.RestUserEndpoints;
import com.feed_the_beast.javacurselib.service.contacts.contacts.ContactsResponse;
import com.feed_the_beast.javacurselib.service.contacts.users.UserProfileNotification;
import com.feed_the_beast.javacurselib.service.logins.login.LoginRequest;
import com.feed_the_beast.javacurselib.service.logins.login.LoginResponse;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionRequest;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionResponse;
import com.feed_the_beast.javacurselib.utils.CurseGUID;
import com.feed_the_beast.javacurselib.websocket.WebSocket;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.NotificationsServiceContractType;
import lombok.extern.slf4j.Slf4j;
import retrofit2.adapter.java8.HttpException;

import java.net.URI;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;

@Slf4j
public class CurseApp {
    private static LoginResponse lr = null;

    private static CreateSessionResponse sessionResponse = null;
    public static ContactsResponse contactsResponse = null;
    private static RestUserEndpoints rest;

    public static void main (String args[]) {
        /********
         * Login request: synchronous call (example)
         *******/
        rest = new RestUserEndpoints();

        String user = args.length >= 2 ? args[0] : System.getenv("JAVACURSEAPI_USER");
        String pass = args.length >= 2 ? args[1] : System.getenv("JAVACURSEAPI_PASS");
        rest.setupEndpoints();
        lr = rest.doLogin(new LoginRequest(user, pass));
        log.info("Synchronous login done: {}", lr);

        /********
         * Session: Asynchronous call (example)
         *******/

        // create latch, extra synchronization to create sane example
        CountDownLatch sessionLatch = new CountDownLatch(1);

        CompletableFuture<CreateSessionResponse> createSessionResponseCompletableFuture = rest.session.create(new CreateSessionRequest(CurseGUID.newRandomUUID(), DevicePlatform.UNKNOWN));

        createSessionResponseCompletableFuture.whenComplete((r, e) -> {
            if (e != null) {
                if (e.getCause() instanceof HttpException) {
                    log.error("Request failed: HTTP code: {}", ((HttpException) e.getCause()).code());
                    // TODO: see comment in login response
                } else {
                    log.error("failed", e);
                }
                System.exit(1);
            }

            // all is ok. Set value
            sessionResponse = r;
            // and make man thread to continue again
            sessionLatch.countDown();
        });

        // ugly code/synchronization just to implement example
        try {
            sessionLatch.await();
            // as soon as lock opened we know that sessionResponse is usable and it is safe to start websocket
        } catch (InterruptedException e) {
            System.exit(1);
            // should not happen, just ignore
        }
        log.info("Async session done: {}", sessionResponse);

        /***************************
         *  experiment with data.
         ***************************/

        contactsResponse = rest.contacts.get().join(); // wil throw RuntimeException if fails
        contactsResponse.groups.stream().filter(g -> g.groupTitle.equals("CurseForge")).forEach(g -> g.channels.stream().filter(c -> c.groupTitle.equals("app-api-chat")).forEachOrdered(c -> {
            log.info("you probably have access to this magical API Channel if you are seeing this code");
        }));

        log.info("ContactResponse: {}", contactsResponse);

        UserProfileNotification myInfo = rest.users.getByID(sessionResponse.user.userID).join();
        log.info("my own user info: {}", myInfo);

        /************************************
         *  websocket testing/example code
         *************************************/
        WebSocket ws = null;
        try {
            ws = new WebSocket(lr, sessionResponse, new URI(Apis.NOTIFICATIONS));
        } catch (Exception e) {
            log.error("failed", e);
            System.exit(0);
        }

        // new safe(sic) websocket logging system
        //ws.addRawTask(new RawResponseLoggerTask()); // not needed anymore. TraceResponseTask is more intelligent
        ws.addTaskForAllTypes(new TraceResponseTask(false, true, NotificationsServiceContractType.FRIENDSHIP_CHANGE_NOTIFICATION, NotificationsServiceContractType.CONVERSATION_READ_NOTIFICATION,
                NotificationsServiceContractType.GROUP_PRESENCE_NOTIFICATION));
        ws.addRequestTask(new TraceRequestTask(false));

        // to add your own handlers call ws.getResponseHandler() and configure it
        CountDownLatch latch = new CountDownLatch(1);
        ws.start();
        log.info("Websocket up and running, block main thread to keep application running");
        try {
            latch.await();
        } catch (InterruptedException e) {
        }
    }
}
