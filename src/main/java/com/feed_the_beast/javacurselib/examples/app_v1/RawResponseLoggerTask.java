package com.feed_the_beast.javacurselib.examples.app_v1;

import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.RawTask;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Nonnull;

/**
 * Logs serialized message from websocket before serialization process.
 */
@Slf4j
public class RawResponseLoggerTask implements RawTask {
    @Override
    public void execute(@Nonnull String message) {
        // log raw serialized message
        log.trace(message);
    }
}