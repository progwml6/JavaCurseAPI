package com.feed_the_beast.javacurselib.examples.app_v1;

import com.feed_the_beast.javacurselib.CurseGUID;
import com.feed_the_beast.javacurselib.websocket.WebSocket;
import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.Task;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.ConversationMessageNotification;

import javax.annotation.Nonnull;

public class BotTask implements Task<ConversationMessageNotification> {
    @Override
    public void execute(@Nonnull WebSocket webSocket, @Nonnull ConversationMessageNotification msg) {
        if (msg.body.startsWith("!ban") && msg.senderName.equals("jikuja")) {
            System.out.println("LOLBAN" + msg.body.startsWith("!ban".split(" ")[1]));
        }

        if (msg.body.startsWith("!ban")) {
            // maybe works, maybe not
            webSocket.sendMessage(msg.conversationID, "Lol !ban");
        }
    }
}
