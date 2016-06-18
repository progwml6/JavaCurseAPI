package com.feed_the_beast.javacurselib.examples.app_v1;

import com.feed_the_beast.javacurselib.websocket.WebSocket;
import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.Task;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.ConversationMessageNotification;

import javax.annotation.Nonnull;

public class TestTask implements Task<ConversationMessageNotification> {
    @Override
    public void execute(@Nonnull WebSocket webSocket, @Nonnull ConversationMessageNotification msg) {
        // do nothing. Just be here and make sure we can have execute() with concrete Notifications
        msg.body.isEmpty();
    }
}