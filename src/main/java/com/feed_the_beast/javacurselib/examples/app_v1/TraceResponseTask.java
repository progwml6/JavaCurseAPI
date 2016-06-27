package com.feed_the_beast.javacurselib.examples.app_v1;


import com.feed_the_beast.javacurselib.websocket.WebSocket;
import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.Task;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.NotificationsServiceContractType;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.Response;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Nonnull;

// TODO:
// * add filtering(do not log pings)

/**
 * Logs deserialized Response object
 */

@Slf4j
public class TraceResponseTask implements Task {
    private boolean extraForUnknown = false;

    public TraceResponseTask(boolean extraForUnknown) {
        this.extraForUnknown = extraForUnknown;
    }

    public TraceResponseTask() {
    }

    @Override
    public void execute(@Nonnull WebSocket webSocket, @Nonnull Response response) {
        if (log.isTraceEnabled()) {
            // log deserialized object
            log.trace(response.toString());
        }
        if (extraForUnknown && response.getTypeID() == NotificationsServiceContractType.UNKNOWN) {
            log.warn("Unknown Response: " + response.getOrigMessage());
        }
    }
}
