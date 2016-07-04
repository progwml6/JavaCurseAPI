package com.feed_the_beast.javacurselib.examples.app_v1;

import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.RawTask;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Nonnull;
import java.util.Collections;
import java.util.Set;

/**
 * Logs serialized message from websocket before serialization process.
 */
@Slf4j
public class RawResponseLoggerTask implements RawTask {
    private Set<String> ignores;

    public RawResponseLoggerTask() {
        ignores = Collections.emptySet();
    }

    public RawResponseLoggerTask(Set<String> ignores) {
        this.ignores = ignores;
    }

    @Override
    public void execute(@Nonnull String message) {
        if (ignores.stream().noneMatch(message::matches)) {
            // log raw serialized message
            log.trace(message);
        }
    }
}