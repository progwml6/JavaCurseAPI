package com.feed_the_beast.javacurselib.websocket;

import com.feed_the_beast.javacurselib.service.logins.login.LoginResponse;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionResponse;
import com.feed_the_beast.javacurselib.websocket.messages.handler.RequestHandler;
import com.feed_the_beast.javacurselib.websocket.messages.requests.JoinRequest;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.Response;
import com.feed_the_beast.javacurselib.websocket.messages.handler.ResponseHandler;

import javax.annotation.Nonnull;
import javax.websocket.*;
import java.util.logging.Logger;

public class NotificationsEndPoint extends Endpoint {
    private static final Logger logger = Logger.getLogger(NotificationsEndPoint.class.getName());
    private JoinRequest initRequest;
    private ResponseHandler responsehandler;
    private RequestHandler requestHandler;
    private WebSocket webSocket;

    public NotificationsEndPoint(@Nonnull LoginResponse loginResponse, @Nonnull CreateSessionResponse sessionResponse, @Nonnull WebSocket webSocket) {
        this.initRequest = new JoinRequest(loginResponse, sessionResponse);
        this.responsehandler = webSocket.getResponseHandler();
        this.requestHandler = webSocket.getRequestHandler();
        this.webSocket = webSocket;
    }

    @Override
    public void onOpen(final Session session, EndpointConfig ec) {
        logger.info(String.format("Websocket connection opened: %s. Adding message handles into session and sending join requests", session.getId()));
        session.addMessageHandler(new NotificationsMessageHandler(responsehandler));
        requestHandler.setSession(session);
        requestHandler.execute(initRequest);
    }


    @Override
    public void onClose(Session session, CloseReason closeReason) {
        logger.warning(String.format("Session %s close because of %s", session.getId(), closeReason));
        // TODO: should this reconnect?

    }

    @Override
    public void onError(Session session, Throwable t) {
        logger.severe(String.format("Session %s errored: %s", session.getId(), t.toString()));
        t.printStackTrace();
        //TODO: reconnect?!
    }

    private static class NotificationsMessageHandler implements MessageHandler.Whole<String> {
        private final ResponseHandler responseHandler;

        public NotificationsMessageHandler(ResponseHandler responseHandler) {
            this.responseHandler = responseHandler;
        }

        @Override
        public void onMessage(String msg) {
            try {
                Response response = JsonFactory.stringToResponse(msg);

                // Send parsed instance of Response to internal handlers
                if (responseHandler.executeInternalTasks(response)) {
                    // continue prosessing with user-defined handlers
                    responseHandler.executeTasks(response);
                }
            } catch (Exception e) {
                logger.severe("onMessage failed");
                e.printStackTrace();
            }
        }
    }
}
