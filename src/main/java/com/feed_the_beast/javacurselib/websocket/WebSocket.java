package com.feed_the_beast.javacurselib.websocket;

import com.feed_the_beast.javacurselib.utils.CurseGUID;
import com.feed_the_beast.javacurselib.service.logins.login.LoginResponse;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionResponse;
import com.feed_the_beast.javacurselib.websocket.messages.handler.RequestHandler;
import com.feed_the_beast.javacurselib.websocket.messages.handler.ResponseHandler;
import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.RawTask;
import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.RequestTask;
import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.Task;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.NotificationsServiceContractType;
import com.feed_the_beast.javacurselib.websocket.messages.requests.ConversationMarkReadRequest;
import com.feed_the_beast.javacurselib.websocket.messages.requests.ConversationMessageRequest;
import com.feed_the_beast.javacurselib.websocket.messages.requests.HandshakeRequest;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Nonnull;
import javax.websocket.*;
import java.io.IOException;
import java.net.URI;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// TODO: split public functions into separated class. Hint: hide implementation behind facade
//
@Slf4j
public class WebSocket {
    private final ResponseHandler responseHandler;
    private final RequestHandler requestHandler;
    private LoginResponse loginResponse;
    private CreateSessionResponse sessionResponse;
    private URI endpoint;
    private Session session;
    private WebSocketContainer client = ContainerProvider.getWebSocketContainer();
    private NotificationsEndPoint notificationsEndPoint;    //TODO: make configurable?
    private ScheduledFuture<?> pingThread;
    private ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

    @Setter
    @Getter
    private boolean logMessages = false;

    // API public
    public WebSocket(@Nonnull LoginResponse loginResponse, @Nonnull CreateSessionResponse sessionResponse, @Nonnull URI endpoint) {
        this.loginResponse = loginResponse;
        this.sessionResponse = sessionResponse;
        this.endpoint = endpoint;

        responseHandler = new ResponseHandler(this);
        requestHandler = new RequestHandler(this);
    }

    // API public
    public boolean start() {
        boolean connected = false;
        while (!connected) {
            try {
                notificationsEndPoint = new NotificationsEndPoint(loginResponse, sessionResponse, this);
                session = client.connectToServer(notificationsEndPoint, null, endpoint);
                connected = true;
            } catch (IOException | DeploymentException e) {
                log.error("failed", e);
            }
        }
        return true;
    }

    // API private
    public void startPingThread() {
        stopPingThread();
        pingThread = scheduledExecutorService.scheduleAtFixedRate(new PingThread(requestHandler),0, 5, TimeUnit.SECONDS);
    }

    // API private
    public void stopPingThread() {
        if (pingThread != null) {
            pingThread.cancel(true);
        }
    }

    // API private
    public ResponseHandler getResponseHandler() {
        return responseHandler;
    }

    // API private
    public RequestHandler getRequestHandler() {
        return requestHandler;
    }


    private Session getSession() {
        return session;
    }

    private static class PingThread implements Runnable {
        private RequestHandler requestHandler;

        public PingThread(RequestHandler requestHandler) {
            this.requestHandler = requestHandler;
        }

        @Override
        public void run() {
            try {
                requestHandler.execute(HandshakeRequest.PING);
            } catch (Exception e) {
                log.error("failed", e);
            }
        }
    }

    /////////////////////////////////////
    // API public requests methods
    /////////////////////////////////////

    /**
     * Send a message. Best effort: sends a message, does not check if successful.
     * </p>
     * Use other methods if Response handling is mandatory. @See WIP
     *
     * @param conversationID Conversation to send a message
     * @param message Message to send
     */
    public void sendMessage(@Nonnull CurseGUID conversationID, @Nonnull String message) {
        ConversationMessageRequest request = new ConversationMessageRequest(conversationID, message);
        requestHandler.execute(request);
    }

    /**
     * Send a message. Best effort: sends a message, does not check if successful.
     * </p>
     * Use other methods if Response handling is mandatory. @See WIP
     *
     * @param request User-supplied message
     */
    public void sendMessage(ConversationMessageRequest request) {
        requestHandler.execute(request);
    }

    // Just send MarkRead. Best-effort Server does not repond for  request

    /**
     * Sends ConversationMarkReadRequest to server. Best effort: server does not send Response for this
     * @param conversationID Conversation to mark read
     */
    public void sendMarkRead(@Nonnull CurseGUID conversationID) {
        ConversationMarkReadRequest request = new ConversationMarkReadRequest(conversationID);
        requestHandler.execute(request);
    }

    ///////////////////////////
    // API public response/notification handler methods
    ///////////////////////////
    /**
     * Adds task handler. Used to execute actions for server Respoinses/Notifications
     * @param task Task to add
     * @param type Type for added task
     */
    public void addTask(@Nonnull Task task, @Nonnull NotificationsServiceContractType type) {
        responseHandler.addTask(task, type);
    }

    /**
     * Adds task handler. Used to execute actions for server Respoinses/Notifications
     * @param task Task to add
     * @param types Types for added task
     */
    public void addTask(@Nonnull Task task, @Nonnull NotificationsServiceContractType... types ) {
        for (NotificationsServiceContractType type: types) {
            responseHandler.addTask(task, type);
        }
    }

    /**
     * Adds task handler for all types. Used to execute actions for server Respoinses/Notifications
     * @param task Task to add
     */
    public void addTaskForAllTypes(@Nonnull Task task) {
        responseHandler.addTaskForAllTypes(task);
    }

    public void addRawTask(@Nonnull RawTask task) {
        responseHandler.addRawTask(task);
    }

    public void addRequestTask(@Nonnull RequestTask task) {
        requestHandler.addTask(task);
    }
}