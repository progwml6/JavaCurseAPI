package com.feed_the_beast.javacurselib.websocket.messages.handler.tasks;

import com.feed_the_beast.javacurselib.websocket.WebSocket;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.Response;

import javax.annotation.Nonnull;

public interface  Task<T extends Response> {
    void execute(@Nonnull WebSocket webSocket, @Nonnull T response);
}
