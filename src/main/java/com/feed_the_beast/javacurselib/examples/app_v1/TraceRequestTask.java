package com.feed_the_beast.javacurselib.examples.app_v1;

import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.RequestTask;
import com.feed_the_beast.javacurselib.websocket.messages.requests.Request;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Nonnull;

// TODO: add filtering

/**
 * Logs Request object before serialization and websocket
 */
@Slf4j
public class TraceRequestTask implements RequestTask {
    @Override
    public void execute(@Nonnull Request request) {
        if (log.isTraceEnabled()) {
            log.trace(request.toString());
        }
    }
}
