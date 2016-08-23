package com.feed_the_beast.javacurselib.websocket;

import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionResponse;
import com.feed_the_beast.javacurselib.websocket.messages.handler.RequestHandler;
import com.feed_the_beast.javacurselib.websocket.messages.handler.ResponseHandler;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.Response;
import com.feed_the_beast.javacurselib.websocket.messages.requests.JoinRequest;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Nonnull;
import javax.websocket.CloseReason;
import javax.websocket.Endpoint;
import javax.websocket.EndpointConfig;
import javax.websocket.MessageHandler;
import javax.websocket.Session;

@Slf4j
public class NotificationsEndPoint extends Endpoint {
    private JoinRequest initRequest;
    private ResponseHandler responsehandler;
    private RequestHandler requestHandler;
    private WebSocket webSocket;

    public NotificationsEndPoint (@Nonnull CreateSessionResponse sessionResponse, @Nonnull WebSocket webSocket) {
        this.initRequest = new JoinRequest(sessionResponse);
        this.responsehandler = webSocket.getResponseHandler();
        this.requestHandler = webSocket.getRequestHandler();
        this.webSocket = webSocket;
    }

    @Override
    public void onOpen (final Session session, EndpointConfig ec) {
        log.trace("Websocket connection opened: {}. Adding message handles into session and sending join requests", session.getId());
        session.addMessageHandler(new NotificationsMessageHandler(responsehandler));
        requestHandler.setSession(session);
        requestHandler.execute(initRequest);
    }

    @Override
    public void onClose (Session session, CloseReason closeReason) {
        log.warn("Session {} close because of {}", session.getId(), closeReason);
        log.trace("stack: {}", new Exception());
        // TODO: should this reconnect?
        if (webSocket.isReconnect() && !webSocket.getConnecting().getAndSet(true)) {
            log.info("Session closed: Reconnecting... ");
            webSocket.start();
        }

    }

    @Override
    public void onError (Session session, Throwable t) {
        log.error("Session {} errored: {}", session.getId(), t.toString(), t);
        if (webSocket.isReconnect() && !webSocket.getConnecting().getAndSet(true)) {
            log.info("Session errored: Reconnecting... ");
            webSocket.start();
        }
    }

    private class NotificationsMessageHandler implements MessageHandler.Whole<String> {
        private final ResponseHandler responseHandler;

        public NotificationsMessageHandler (ResponseHandler responseHandler) {
            this.responseHandler = responseHandler;
        }

        @Override
        public void onMessage (String msg) {
            Response response;

            // send message to low level RawTask before Gson deserilization
            try {
                responseHandler.executeRawTasks(msg);
            } catch (Exception e) {
                log.error("Failed while executing raw tasks", e);
            }

            // parse json
            try {
                response = JsonFactory.stringToResponse(msg);
            } catch (Exception e) {
                log.error("Failed while parsing message : " + msg);
                log.error("", e);
                return; // there is nothing we can do
            }

            try {
                // Send deserialized message to internal handlers
                responseHandler.executeInternalTasks(response);

                // continue prosessing with user-defined handlers
                responseHandler.executeTasks(response);
            } catch (Exception e) {
                log.error("Failed while executing tasks", e);
            }
        }
    }
}
