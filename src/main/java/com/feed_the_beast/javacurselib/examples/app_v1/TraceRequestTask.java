package com.feed_the_beast.javacurselib.examples.app_v1;

import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.RequestTask;
import com.feed_the_beast.javacurselib.websocket.messages.requests.Request;
import com.feed_the_beast.javacurselib.websocket.messages.requests.RequestsServiceContractType;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Nonnull;

/**
 * Logs Request object before serialization and websocket
 */
@Slf4j
public class TraceRequestTask implements RequestTask {
    private boolean logPings = false;

    public TraceRequestTask(boolean logPings) {
        this.logPings = logPings;
    }

    public TraceRequestTask() {
    }

    @Override
    public void execute(@Nonnull Request request) {
        if (log.isTraceEnabled()) {
            if (request.getTypeID() == RequestsServiceContractType.HANDSHAKE) {
                if (logPings) {
                    log.trace(request.toString());
                }
            } else {
                log.trace(request.toString());
            }
        }
    }
}
