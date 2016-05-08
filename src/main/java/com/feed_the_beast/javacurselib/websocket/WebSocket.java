package com.feed_the_beast.javacurselib.websocket;

import com.feed_the_beast.javacurselib.CurseGUID;
import com.feed_the_beast.javacurselib.service.logins.login.LoginResponse;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionResponse;
import com.feed_the_beast.javacurselib.websocket.messages.handler.RequestHandler;
import com.feed_the_beast.javacurselib.websocket.messages.handler.ResponseHandler;
import com.feed_the_beast.javacurselib.websocket.messages.requests.ConversationMarkReadRequest;
import com.feed_the_beast.javacurselib.websocket.messages.requests.ConversationMessageRequest;
import com.feed_the_beast.javacurselib.websocket.messages.requests.HandshakeRequest;

import javax.annotation.Nonnull;
import javax.websocket.*;
import java.io.IOException;
import java.net.URI;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

// TODO: split public functions into separated class. Hint: hide implementation behind facade
//
public class WebSocket {
    private static final Logger logger = Logger.getLogger(WebSocket.class.getName());

    private final ResponseHandler responseHandler = new ResponseHandler();
    private final RequestHandler requestHandler;
    private LoginResponse loginResponse;
    private CreateSessionResponse sessionResponse;
    private URI endpoint;
    private Session session;
    private WebSocketContainer client = ContainerProvider.getWebSocketContainer();
    private NotificationsEndPoint notificationsEndPoint;    //TODO: make configurable?
    private ScheduledFuture<?> pingThread;
    private ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

    public WebSocket(@Nonnull LoginResponse loginResponse, @Nonnull CreateSessionResponse sessionResponse, @Nonnull URI endpoint) {
        this.loginResponse = loginResponse;
        this.sessionResponse = sessionResponse;
        this.endpoint = endpoint;

        responseHandler.setWebSocket(this);
        requestHandler = new RequestHandler(this);
    }

    public boolean start() {
        boolean connected = false;
        while (!connected) {
            try {
                notificationsEndPoint = new NotificationsEndPoint(loginResponse, sessionResponse, this);
                session = client.connectToServer(notificationsEndPoint, null, endpoint);
                connected = true;
            } catch (IOException | DeploymentException e) {
                logger.severe("failed");
                e.printStackTrace();
            }
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
            }
        }
        return true;
    }

    public void startPingThread() {
        stopPingThread();
        pingThread = scheduledExecutorService.scheduleAtFixedRate(new PingThread(),0, 5, TimeUnit.SECONDS);
    }

    public void stopPingThread() {
        if (pingThread != null) {
            pingThread.cancel(true);
        }
    }

    public ResponseHandler getResponseHandler() {
        return responseHandler;
    }

    public RequestHandler getRequestHandler() {
        return requestHandler;
    }

    public Session getSession() {
        return session;
    }

    private class PingThread implements Runnable {
        @Override
        public void run() {
            try {
                requestHandler.execute(HandshakeRequest.PING);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // Sends a message. Best-effort, does not check return codes or socket error
    // TODO: write proper message queue
    public void sendMessage(@Nonnull CurseGUID conversationID, @Nonnull String message) {
        ConversationMessageRequest request = new ConversationMessageRequest(conversationID, message);
        requestHandler.execute(request);
    }

    // Send a message object. Useful if you implement your own message queue and checking
    public void sendMessage(ConversationMarkReadRequest request) {
        requestHandler.execute(request);
    }

    // Just send MarkRead. Best-effort Server does not repond for  request
    public void sendMarkRead(@Nonnull CurseGUID conversationID) {
        ConversationMarkReadRequest request = new ConversationMarkReadRequest(conversationID);
        requestHandler.execute(request);
    }
}