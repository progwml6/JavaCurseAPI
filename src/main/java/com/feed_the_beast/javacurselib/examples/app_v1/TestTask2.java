package com.feed_the_beast.javacurselib.examples.app_v1;

import com.feed_the_beast.javacurselib.websocket.WebSocket;
import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.Task;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.Response;

import javax.annotation.Nonnull;

// Note: do not user
@Deprecated
public class TestTask2 implements Task {
    @Override
    public void execute(@Nonnull WebSocket webSocket, @Nonnull Response response) {
        // Compare with TestTask1. Now we can access only methods defined in Response interface
        response.getTypeID();
    }
}