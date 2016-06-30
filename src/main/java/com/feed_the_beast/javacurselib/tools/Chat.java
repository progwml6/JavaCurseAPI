package com.feed_the_beast.javacurselib.tools;

import com.feed_the_beast.javacurselib.common.enums.ConversationNotificationType;
import com.feed_the_beast.javacurselib.common.enums.ConversationType;
import com.feed_the_beast.javacurselib.common.enums.DevicePlatform;
import com.feed_the_beast.javacurselib.data.Apis;
import com.feed_the_beast.javacurselib.rest.RestUserEndpoints;
import com.feed_the_beast.javacurselib.service.contacts.contacts.ContactsResponse;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionRequest;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionResponse;
import com.feed_the_beast.javacurselib.utils.CurseGUID;
import com.feed_the_beast.javacurselib.websocket.WebSocket;
import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.Task;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.ConversationMessageNotification;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.NotificationsServiceContractType;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Nonnull;
import java.net.URI;
import java.util.concurrent.CountDownLatch;

@Slf4j
public class Chat {
    static ContactsResponse contacts;
    static CreateSessionResponse session;

    // slf4-simplelogger is really simple...
    // try with  -Dorg.slf4j.simpleLogger.showShortLogName=true -Dorg.slf4j.simpleLogger.showThreadName=false -Dorg.slf4j.simpleLogger.dateTimeFormat="k:m"
    public static void main(String[] args) throws Exception {
        CountDownLatch latch = new CountDownLatch(1);
        log.info("Basic Chat");
        RestUserEndpoints endpoints = Tool.init();

        contacts = endpoints.contacts.get().get();
        session = endpoints.session.create(new CreateSessionRequest(CurseGUID.newRandomUUID(), DevicePlatform.UNKNOWN)).get();

        WebSocket webSocket = new WebSocket(Tool.lr, session, new URI(Apis.NOTIFICATIONS));
        webSocket.addTask(new ChatTask(), NotificationsServiceContractType.CONVERSATION_MESSAGE_NOTIFICATION);
        webSocket.start();
        latch.await();
    }

    private static class ChatTask implements Task<ConversationMessageNotification> {
        @Override
        public void execute(@Nonnull WebSocket webSocket, @Nonnull ConversationMessageNotification response) {
            switch (response.conversationType) {
                case GROUP: {
                    // normal discussion in the channel
                    // groups created with start a group button in friends tab seems to use this type
                    //   * name mapping not working for this
                    //   * only group title can be used || conversationID and rootConversationID are identical
                    //   * other data to separate this type of message from regular chat in channels?
                    log.info("{}/{} <{}> {}{}",
                            contacts.getGroupNamebyId(response.rootConversationID).orElse("unknown"),
                            contacts.getChannelNamebyId(response.conversationID).orElse("unknown"),
                            response.senderName,
                            response.body,
                            suffix(response));
                }
                case FRIENDSHIP: { // PM from frieds
                    log.info("<{}> {}{}", response.senderName, response.body, suffix(response));
                }
                case ADHOC:
                    log.info("TODO: report following line. Describe source of that, please tyvm\n{}", response);
                case GROUP_PRIVATE_CONVERSATION: {
                    // TODO: fix UUID part
                    log.info("{}/<{}> {}{}", contacts.getGroupNamebyId(response.rootConversationID),
                            response.senderName, response.body, suffix(response));
                }
                // note: chats in audio calls uses different websocket endpoint and messages

            }
        }

        private String suffix (ConversationMessageNotification response) {
            return response.notificationType != ConversationNotificationType.NORMAL ? " (" + response.notificationType.name() + ")" : "";
        }
    }
}