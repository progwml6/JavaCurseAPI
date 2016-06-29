package com.feed_the_beast.javacurselib.examples.app_v1;

import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.RequestTask;
import com.feed_the_beast.javacurselib.websocket.messages.requests.Request;
import com.feed_the_beast.javacurselib.websocket.messages.requests.RequestsServiceContractType;
import com.google.common.collect.Sets;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Nonnull;
import java.util.Arrays;
import java.util.Set;

/**
 * Logs Request object before serialization and websocket
 */
@Slf4j
public class TraceRequestTask implements RequestTask {
    private boolean logPings = false;
    private Set<RequestsServiceContractType> ignoredRequests = Sets.newHashSet();

    public TraceRequestTask(boolean logPings, RequestsServiceContractType... ignoredRequest) {
        this.logPings = logPings;
        this.ignoredRequests.addAll(Arrays.asList(ignoredRequest));
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
            } else if (!ignoredRequests.contains(request.getTypeID())) {
                log.trace(request.toString());
            }
        }
    }
}
