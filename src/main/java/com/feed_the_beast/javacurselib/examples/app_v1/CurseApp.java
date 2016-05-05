package com.feed_the_beast.javacurselib.examples.app_v1;

import com.feed_the_beast.javacurselib.data.Apis;
import com.feed_the_beast.javacurselib.data.JsonFactory;
import com.feed_the_beast.javacurselib.service.contacts.contacts.ChannelContract;
import com.feed_the_beast.javacurselib.service.contacts.contacts.ContactsResponse;
import com.feed_the_beast.javacurselib.service.contacts.contacts.GroupNotification;
import com.feed_the_beast.javacurselib.service.logins.login.LoginRequest;
import com.feed_the_beast.javacurselib.service.logins.login.LoginResponse;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionRequest;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionResponse;
import com.feed_the_beast.javacurselib.service.sessions.sessions.DevicePlatform;
import com.feed_the_beast.javacurselib.utils.NetworkRequest;
import com.feed_the_beast.javacurselib.websocket.WebSocket;
import com.feed_the_beast.javacurselib.websocket.messages.handler.ResponseHandler;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.NotificationsServiceContractType;

import java.net.URI;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;

/**
 * Created by progwml6 on 4/28/16.
 */
public class CurseApp {

    public static boolean isDebugMode() {
        return true;
    }
    public static LoginResponse login (String username, String password) {
        LoginRequest lr = new LoginRequest(username, password);
        String jsonToSend = JsonFactory.GSON.toJson(lr);
        String s = NetworkRequest.postJson(Apis.LOGINS + "login", jsonToSend, null);
        LoginResponse ret = JsonFactory.GSON.fromJson(s, LoginResponse.class);
        return ret;
    }

    public static ContactsResponse getContacts (String token) {
        String str = NetworkRequest.getJson(Apis.CONTACTS + "contacts", token);
        return JsonFactory.GSON.fromJson(str, ContactsResponse.class);
    }

    public static CreateSessionResponse getSession (String token, UUID machinekey, DevicePlatform platform) {
        String jsonToSend = JsonFactory.GSON.toJson(new CreateSessionRequest(machinekey, platform));
        String str = NetworkRequest.postJson(Apis.SESSIONS +"sessions", jsonToSend, token);
        return JsonFactory.GSON.fromJson(str, CreateSessionResponse.class);
    }

    public static void main (String args[]) {
        LoginResponse lr = login(args[0], args[1]);
        ContactsResponse cr = getContacts(lr.session.token);
        CreateSessionResponse sessionResponse = getSession(lr.session.token, UUID.randomUUID(), DevicePlatform.UNKNOWN);
        for (GroupNotification g : cr.groups) {
            if (g.groupTitle.equals("CurseForge")) {
                for (ChannelContract c : g.channels) {
                    if (c.groupTitle.equals("app-api-chat")) {
                        System.out.println("you probably have access to this magical API Channel if you are seeing this code");
                    }
                }
            }
        }
        System.out.println(sessionResponse.sessionID);

        // websocket testing code starts here
        WebSocket ws = null;
        try {
            ws = new WebSocket(lr, sessionResponse, new URI(Apis.NOTIFICATIONS));
        } catch (Exception e) {
            System.out.println("failed");
            e.printStackTrace();
            System.exit(0);
        }

        ResponseHandler responseHandler = ws.getResponseHandler();
        responseHandler.addTask(new DebugResponseTask(), NotificationsServiceContractType.CONVERSATION_MESSAGE_NOTIFICATION);
        responseHandler.addTask(new DefaultResponseTask(), NotificationsServiceContractType.UNKNOWN);

        // to add your own handlers call ws.getResponseHandler() and configure it
        CountDownLatch latch = new CountDownLatch(1);
        ws.start();
        try {
            latch.await();
        } catch (InterruptedException e) {
        }
    }
}
