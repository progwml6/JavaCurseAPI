package com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.internal;

import com.feed_the_beast.javacurselib.websocket.messages.handler.RequestHandler;
import com.feed_the_beast.javacurselib.websocket.messages.requests.HandshakeRequest;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.Response;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Nonnull;

@Slf4j
public class JoinResponseTask implements Task<Response> {
    @Override
    public void execute(@Nonnull RequestHandler requestHandler, @Nonnull Response response) {
        log.trace("Got JoinResponse: " + response);
        requestHandler.execute(HandshakeRequest.PING);
    }
}