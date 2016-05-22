package com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.internal;

import com.feed_the_beast.javacurselib.websocket.messages.handler.RequestHandler;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.JoinResponse;
import com.feed_the_beast.javacurselib.websocket.messages.requests.HandshakeRequest;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.Response;

import javax.annotation.Nonnull;
import java.util.logging.Logger;

public class JoinResponseTask implements Task<Response> {
    private static final Logger logger = Logger.getLogger(JoinResponseTask.class.getName());

    @Override
    public void execute(@Nonnull RequestHandler requestHandler, @Nonnull Response response) {
        logger.info("Got JoinResponse: " + response);
        requestHandler.execute(HandshakeRequest.PING);
    }
}