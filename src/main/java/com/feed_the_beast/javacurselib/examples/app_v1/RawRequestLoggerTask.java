package com.feed_the_beast.javacurselib.examples.app_v1;

import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.RequestTask;
import com.feed_the_beast.javacurselib.websocket.messages.requests.Request;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Nonnull;

/**
 * Logs serialized message before message is handled to websocket
 */
@Slf4j
public class RawRequestLoggerTask implements RequestTask {
    @Override
    public void execute(@Nonnull Request request) {
        if (log.isTraceEnabled()) {
            log.trace(request.toString());
        }
    }
}
