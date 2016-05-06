package com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.internal;

import com.feed_the_beast.javacurselib.websocket.messages.handler.RequestHandler;
import com.feed_the_beast.javacurselib.websocket.messages.requests.HandshakeRequest;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.Response;

import javax.annotation.Nonnull;
import java.util.logging.Logger;

public class HandshakeResponseTask implements Task {
    private static final Logger logger = Logger.getLogger(HandshakeResponseTask.class.getName());

    @Override
    public void execute(@Nonnull RequestHandler requestHandler, @Nonnull Response response) {
        logger.finest("got ping");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        requestHandler.execute(HandshakeRequest.PING);
    }
}