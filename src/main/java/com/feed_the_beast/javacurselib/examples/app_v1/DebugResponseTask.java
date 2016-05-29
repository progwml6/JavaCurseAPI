package com.feed_the_beast.javacurselib.examples.app_v1;


import com.feed_the_beast.javacurselib.websocket.WebSocket;
import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.Task;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.Response;

import javax.annotation.Nonnull;
import java.util.logging.Logger;

public class DebugResponseTask implements Task {
    private static final Logger logger = Logger.getLogger(DebugResponseTask.class.getName());
    @Override
    public void execute(@Nonnull WebSocket webSocket, @Nonnull Response response) {
        logger.info(String.format("Class: %s\n\tjson: %s\n\ttoString: %s", response.getClass().getSimpleName(), response.getOrigMessage(), response.toString()));
    }
}
