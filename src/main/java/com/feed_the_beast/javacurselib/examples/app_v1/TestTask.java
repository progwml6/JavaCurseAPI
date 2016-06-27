package com.feed_the_beast.javacurselib.examples.app_v1;

import com.feed_the_beast.javacurselib.websocket.WebSocket;
import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.Task;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.ConversationMessageNotification;

import javax.annotation.Nonnull;

// Note: do not use.
@Deprecated
public class TestTask implements Task<ConversationMessageNotification> {
    @Override
    public void execute(@Nonnull WebSocket webSocket, @Nonnull ConversationMessageNotification msg) {
        // do nothing
        msg.body.isEmpty(); // body is field of ConversationMessageNotification instance. Making sure we can access it
    }
}