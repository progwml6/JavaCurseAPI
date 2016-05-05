package com.feed_the_beast.javacurselib.examples.app_v1;

import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.Task;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.ConversationMessageNotification;

import javax.websocket.Session;

public class BotTask implements Task<ConversationMessageNotification> {
    @Override
    public void execute(Session session, ConversationMessageNotification msg) {
        if (msg.body.startsWith("!ban") && msg.senderName.equals("jikuja")) {
            System.out.println("LOLBAN" + msg.body.startsWith("!ban".split(" ")[1]));
        }
    }
}