package com.feed_the_beast.javacurselib.websocket;


import com.feed_the_beast.javacurselib.service.logins.login.LoginResponse;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionResponse;
import com.feed_the_beast.javacurselib.websocket.messages.requests.JoinRequest;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.Response;
import com.feed_the_beast.javacurselib.websocket.messages.ResponseParser;
import com.feed_the_beast.javacurselib.websocket.messages.handler.ResponseHandler;

import javax.annotation.Nonnull;
import javax.websocket.*;
import java.util.logging.Logger;

public class NotificationsEndPoint extends Endpoint {
    private static final Logger logger = Logger.getLogger(NotificationsEndPoint.class.getName());
    private JoinRequest initRequest;
    private ResponseHandler responsehandler;

    public NotificationsEndPoint(@Nonnull LoginResponse loginResponse, @Nonnull CreateSessionResponse sessionResponse, @Nonnull String endpoint, @Nonnull ResponseHandler responseHandler) {
        this.initRequest = new JoinRequest(loginResponse, sessionResponse);
        this.responsehandler = responseHandler;
    }

    @Override
    public void onOpen(final Session session, EndpointConfig ec) {
        logger.info("Connected ... " + session.getId());

        logger.info("adding message handled");
        session.addMessageHandler(new NotificationsMessageHandler(session, responsehandler));

        logger.info("sending InitRequest to start communication");
        initRequest.execute(session);
    }


    @Override
    public void onClose(Session session, CloseReason closeReason) {
        logger.info(String.format("Session %s close because of %s", session.getId(), closeReason));
    }

    @Override
    public void onError(Session session, Throwable t) {
        logger.severe(String.format("Session %s errored: %s", session.getId(), t.toString()));
        t.printStackTrace();
    }

    private static class NotificationsMessageHandler implements MessageHandler.Whole<String> {
        private final Session session;
        private final ResponseHandler responseHandler;

        public NotificationsMessageHandler(Session session, ResponseHandler responseHandler) {
            this.session = session;
            this.responseHandler = responseHandler;
        }

        @Override
        public void onMessage(String msg) {
            try {
                Response response = ResponseParser.stringToObject(msg);
                responseHandler.executeTasks(response, session);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
