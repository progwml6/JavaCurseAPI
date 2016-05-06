package com.feed_the_beast.javacurselib.websocket.messages.handler;

import com.feed_the_beast.javacurselib.websocket.WebSocket;
import com.feed_the_beast.javacurselib.websocket.messages.requests.Request;

import javax.annotation.Nonnull;
import javax.websocket.Session;
import java.util.logging.Logger;

public class RequestHandler {
    private static final Logger logger = Logger.getLogger(RequestHandler.class.getName());
    private Session session;
    private WebSocket webSocket;

    public RequestHandler(WebSocket webSocket) {
        this.webSocket = webSocket;
    }

    public void execute(@Nonnull Request request) {
        logger.finest("Sending: " + request.toJsonString());
        request.execute(session);

        // TODO: !
        // if fails
        // websocket.start()
    }

    public void setSession(Session session) {
        this.session = session;
    }
}