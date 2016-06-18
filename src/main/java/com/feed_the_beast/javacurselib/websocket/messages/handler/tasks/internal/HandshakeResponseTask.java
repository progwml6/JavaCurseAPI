package com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.internal;

import com.feed_the_beast.javacurselib.websocket.messages.handler.RequestHandler;
import com.feed_the_beast.javacurselib.websocket.messages.requests.HandshakeRequest;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.Response;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Nonnull;

@Slf4j
public class HandshakeResponseTask implements Task {
    @Override
    public void execute(@Nonnull RequestHandler requestHandler, @Nonnull Response response) {
        log.trace("got ping");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        requestHandler.execute(HandshakeRequest.PING);
    }
}