package com.feed_the_beast.javacurselib.websocket;

import com.feed_the_beast.javacurselib.service.logins.login.LoginResponse;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionResponse;
import com.feed_the_beast.javacurselib.websocket.messages.handler.RequestHandler;
import com.feed_the_beast.javacurselib.websocket.messages.handler.ResponseHandler;
import com.feed_the_beast.javacurselib.websocket.messages.requests.ConversationMarkReadRequest;
import com.feed_the_beast.javacurselib.websocket.messages.requests.ConversationMessageRequest;

import javax.annotation.Nonnull;
import javax.websocket.*;
import java.io.IOException;
import java.net.URI;
import java.util.UUID;
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

    public WebSocket(@Nonnull LoginResponse loginResponse, @Nonnull CreateSessionResponse sessionResponse, @Nonnull URI endpoint) {
        this.loginResponse = loginResponse;
        this.sessionResponse = sessionResponse;
        this.endpoint = endpoint;

        responseHandler.setWebSocket(this);
        requestHandler = new RequestHandler(this);
    }

    public boolean start() {
        try {
            notificationsEndPoint = new NotificationsEndPoint(loginResponse, sessionResponse, responseHandler, requestHandler);
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

    public RequestHandler getRequestHandler() {
        return requestHandler;
    }

    public Session getSession() {
        return session;
    }

    // Sends a message. Best-effort, does not check return codes or socket error
    // TODO: write proper message queue
    public void sendMessage(@Nonnull UUID conversationID, String message) {
        ConversationMessageRequest request = new ConversationMessageRequest(conversationID, message);
        requestHandler.execute(request);
    }

    // Send a message object. Useful if you implement your own message queue and checking
    public void sendMessage(ConversationMarkReadRequest request) {
        requestHandler.execute(request);
    }

    // Just send MarkRead. Best-effort Server does not repond for  request
    public void sendMarkRead(@Nonnull UUID conversationID) {
        ConversationMarkReadRequest request = new ConversationMarkReadRequest(conversationID);
        requestHandler.execute(request);
    }
}