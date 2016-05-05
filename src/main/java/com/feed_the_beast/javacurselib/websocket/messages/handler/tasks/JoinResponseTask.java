package com.feed_the_beast.javacurselib.websocket.messages.handler.tasks;

import com.feed_the_beast.javacurselib.websocket.messages.requests.HandshakeRequest;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.Response;

import javax.websocket.Session;
import java.util.logging.Logger;

public class JoinResponseTask implements ResponseTask {
    private static final Logger logger = Logger.getLogger(JoinResponseTask.class.getName());
    @Override
    public void execute(Session session, Response response) {
        logger.info("Got JoinResponse");
        HandshakeRequest.PING.execute(session);
    }
}
