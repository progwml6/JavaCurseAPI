package com.feed_the_beast.javacurselib.websocket.messages.handler.tasks;

import com.feed_the_beast.javacurselib.websocket.messages.requests.HandshakeRequest;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.Response;

import javax.websocket.Session;

public class JoinResponseTask implements ResponseTask {
    @Override
    public void execute(Session session, Response response) {
        HandshakeRequest.PING.execute(session);
    }
}
