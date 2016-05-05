package com.feed_the_beast.javacurselib.websocket.messages.handler.tasks;

import com.feed_the_beast.javacurselib.websocket.messages.requests.HandshakeRequest;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.Response;

import javax.websocket.Session;
import java.util.logging.Logger;

public class HandshakeResponseTask implements Task {
    private static final Logger logger = Logger.getLogger(HandshakeResponseTask.class.getName());
    @Override
    public void execute(Session session, Response response) {
        logger.finest("got ping");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // TODO: check if connection still alive. Where to check?
        HandshakeRequest.PING.execute(session);
    }
}
