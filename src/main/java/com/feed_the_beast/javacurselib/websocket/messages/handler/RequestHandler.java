package com.feed_the_beast.javacurselib.websocket.messages.handler;

import com.feed_the_beast.javacurselib.websocket.WebSocket;
import com.feed_the_beast.javacurselib.websocket.messages.requests.Request;

import javax.annotation.Nonnull;
import javax.websocket.Session;
import java.io.IOException;
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

        try {
            session.getBasicRemote().sendText(request.toJsonString());
        } catch (IOException|IllegalStateException e) {
            //TODO: still fails. Because we don't see a ping reply, we don't send a ping which means problem is not detected
            // Tyrus will notice problem and do onclose but slower then request fail detection
            logger.warning("Error while sending message, reconnecting...");
            webSocket.stopPingThread();
            webSocket.start();
        }
    }

    public void setSession(Session session) {
        this.session = session;
    }
}