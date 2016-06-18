package com.feed_the_beast.javacurselib.examples.app_v1;


import com.feed_the_beast.javacurselib.websocket.WebSocket;
import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.Task;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.Response;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Nonnull;

@Slf4j
public class TraceResponseTask implements Task {
    @Override
    public void execute(@Nonnull WebSocket webSocket, @Nonnull Response response) {
        if (log.isTraceEnabled()) {
            log.trace(response.toString());
        }
    }
}
