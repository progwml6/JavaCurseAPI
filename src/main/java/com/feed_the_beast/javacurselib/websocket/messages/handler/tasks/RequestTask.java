package com.feed_the_beast.javacurselib.websocket.messages.handler.tasks;

import com.feed_the_beast.javacurselib.websocket.messages.requests.Request;

import javax.annotation.Nonnull;

@FunctionalInterface
public interface RequestTask<T extends Request> {
    void execute(@Nonnull T request);
}
