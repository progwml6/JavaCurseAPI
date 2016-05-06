package com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.internal;

import com.feed_the_beast.javacurselib.websocket.messages.handler.RequestHandler;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.Response;

import javax.annotation.Nonnull;

public interface Task<T extends Response> {
    void execute(@Nonnull RequestHandler requestHandler, @Nonnull T response);
}
