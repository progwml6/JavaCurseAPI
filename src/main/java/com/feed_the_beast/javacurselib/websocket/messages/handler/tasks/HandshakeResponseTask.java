package com.feed_the_beast.javacurselib.websocket.messages.handler.tasks;

import com.feed_the_beast.javacurselib.websocket.messages.requests.HandshakeRequest;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.Response;

import javax.websocket.Session;

public class HandshakeResponseTask implements ResponseTask {
    @Override
    public void execute(Session session, Response response) {
        System.out.println("got ping");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // TODO: check if connection still alive. Where to check?
        HandshakeRequest.PING.execute(session);
    }
}
