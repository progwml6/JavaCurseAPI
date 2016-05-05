package com.feed_the_beast.javacurselib.websocket;

import com.feed_the_beast.javacurselib.service.logins.login.LoginResponse;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionResponse;
import com.feed_the_beast.javacurselib.websocket.messages.handler.ResponseHandler;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.*;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.HandshakeResponse;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.JoinResponse;
import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.*;
import com.feed_the_beast.javacurselib.websocket.messages.requests.ConversationMarkReadRequest;
import com.feed_the_beast.javacurselib.websocket.messages.requests.ConversationMessageRequest;

import javax.annotation.Nonnull;
import javax.websocket.*;
import java.io.IOException;
import java.net.URI;
import java.util.UUID;
import java.util.logging.Logger;

public class WebSocket {
    private static final Logger logger = Logger.getLogger(WebSocket.class.getName());

    public ResponseHandler responseHandler = new ResponseHandler();
    private LoginResponse loginResponse;
    private CreateSessionResponse sessionResponse;
    private URI endpoint;
    private Session session;

    public WebSocket(@Nonnull LoginResponse loginResponse, @Nonnull CreateSessionResponse sessionResponse, @Nonnull URI endpoint) {
        this.loginResponse = loginResponse;
        this.sessionResponse = sessionResponse;
        this.endpoint = endpoint;
    }

    public boolean start() {
        WebSocketContainer client = ContainerProvider.getWebSocketContainer();
        NotificationsEndPoint notificationsEndPoint = new NotificationsEndPoint(loginResponse, sessionResponse, responseHandler);

        try {
            session = client.connectToServer(notificationsEndPoint, null, endpoint);
        } catch (IOException|DeploymentException e) {
            logger.severe("failed");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public ResponseHandler getResponseHandler() {
        return responseHandler;
    }

    @Deprecated // use getResponseHandler
    // this if for testing only
    // TODO: add JoinResponseTask and HandshakeResponseTask into internal handler
    public void setupResponseHandlers() {
        responseHandler.addTask(new DebugResponseTask(), -2, ConversationMessageNotification.class);
        responseHandler.addTask(new JoinResponseTask(), 0, JoinResponse.class);
        responseHandler.addTask(new HandshakeResponseTask(), 0, HandshakeResponse.class);
        responseHandler.addTask(new DefaultResponseTask(), -2, UnknownResponse.class);
    }

    // TODO: add logic to check for reply/notification
    public void sendMessage(@Nonnull UUID conversationID, String message) {
        ConversationMessageRequest request = new ConversationMessageRequest(conversationID, message);
        request.execute(session);
    }

    public void sendMarkRead(@Nonnull UUID conversationID, String message) {
        ConversationMarkReadRequest request = new ConversationMarkReadRequest(conversationID);
        request.execute(session);
    }
}