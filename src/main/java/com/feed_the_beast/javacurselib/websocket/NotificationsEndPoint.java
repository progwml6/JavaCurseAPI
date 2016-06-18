package com.feed_the_beast.javacurselib.websocket;

import com.feed_the_beast.javacurselib.examples.app_v1.JsonDiskWriter;
import com.feed_the_beast.javacurselib.service.logins.login.LoginResponse;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionResponse;
import com.feed_the_beast.javacurselib.websocket.messages.handler.RequestHandler;
import com.feed_the_beast.javacurselib.websocket.messages.requests.JoinRequest;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.Response;
import com.feed_the_beast.javacurselib.websocket.messages.handler.ResponseHandler;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Nonnull;
import javax.websocket.*;

@Slf4j
public class NotificationsEndPoint extends Endpoint {
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
        log.trace("Websocket connection opened: {}. Adding message handles into session and sending join requests", session.getId());
        session.addMessageHandler(new NotificationsMessageHandler(responsehandler));
        requestHandler.setSession(session);
        requestHandler.execute(initRequest);
    }


    @Override
    public void onClose(Session session, CloseReason closeReason) {
        log.warn("Session {} close because of {}", session.getId(), closeReason);
        // TODO: should this reconnect?

    }

    @Override
    public void onError(Session session, Throwable t) {
        log.error("Session {} errored: {}", session.getId(), t.toString(), t);
        //TODO: reconnect?!
    }

    private class NotificationsMessageHandler implements MessageHandler.Whole<String> {
        private final ResponseHandler responseHandler;

        public NotificationsMessageHandler(ResponseHandler responseHandler) {
            this.responseHandler = responseHandler;
        }

        @Override
        public void onMessage(String msg) {
            try {
                responseHandler.executeRawTasks(msg);

                // parse json
                Response response = JsonFactory.stringToResponse(msg);

                // Send deserialized message to internal handlers
                responseHandler.executeInternalTasks(response);
                // continue prosessing with user-defined handlers
                responseHandler.executeTasks(response);
            } catch (Exception e) {
                log.error("onMessage failed", e);
            }
        }
    }
}
