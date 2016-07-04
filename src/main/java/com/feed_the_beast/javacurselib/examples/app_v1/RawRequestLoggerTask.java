package com.feed_the_beast.javacurselib.examples.app_v1;

import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.RequestTask;
import com.feed_the_beast.javacurselib.websocket.messages.requests.Request;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Nonnull;
import java.util.Collections;
import java.util.Set;

/**
 * Logs serialized message before message is handled to websocket
 */
@Slf4j
public class RawRequestLoggerTask implements RequestTask {
    private Set<String> ignores;

    public RawRequestLoggerTask() {
        ignores = Collections.emptySet();
    }

    public RawRequestLoggerTask(Set<String> ignores) {
        this.ignores = ignores;
    }

    @Override
    public void execute(@Nonnull Request request) {
        if (log.isTraceEnabled()) {
            String s = request.toJsonString();
            if (ignores.stream().noneMatch(s::matches)) {
                log.trace(request.toJsonString());
            }
        }
    }
}
