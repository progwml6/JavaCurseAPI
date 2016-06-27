package com.feed_the_beast.javacurselib.examples.app_v1;


import com.feed_the_beast.javacurselib.websocket.WebSocket;
import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.Task;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.NotificationsServiceContractType;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.Response;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Nonnull;

/**
 * Logs deserialized Response object
 */

@Slf4j
public class TraceResponseTask implements Task {
    private boolean logPings = false;
    private boolean logExtraInfoForUnknown = false;

    public TraceResponseTask(boolean logPings, boolean logExtraInfoForUnknown) {
        this.logPings = logPings;
        this.logExtraInfoForUnknown = logExtraInfoForUnknown;
    }

    public TraceResponseTask() {
    }

    @Override
    public void execute(@Nonnull WebSocket webSocket, @Nonnull Response response) {
        if (log.isTraceEnabled()) {
            if (response.getTypeID() == NotificationsServiceContractType.HANDSHAKE) {
                if (logPings) {
                    log.trace(response.toString());
                }
            } else {
                log.trace(response.toString());
            }
        }
        if (logExtraInfoForUnknown && response.getTypeID() == NotificationsServiceContractType.UNKNOWN) {
            log.warn("Unknown Response: " + response.getOrigMessage());
        }
    }
}
