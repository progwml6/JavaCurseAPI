package com.feed_the_beast.javacurselib.websocket.messages.handler.tasks;

import javax.annotation.Nonnull;

@FunctionalInterface
public interface RawTask {
    void execute(@Nonnull String message);
}
