package com.feed_the_beast.javacurselib.tools;

import com.feed_the_beast.javacurselib.common.enums.DevicePlatform;
import com.feed_the_beast.javacurselib.data.Apis;
import com.feed_the_beast.javacurselib.rest.RestUserEndpoints;
import com.feed_the_beast.javacurselib.service.contacts.contacts.ContactsResponse;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionRequest;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionResponse;
import com.feed_the_beast.javacurselib.utils.CurseGUID;
import com.feed_the_beast.javacurselib.websocket.WebSocket;
import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.Task;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.GroupPresenceNotification;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.NotificationsServiceContractType;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Nonnull;
import java.net.URI;

/**
 * Shows {@code GroupPresenceNotification}s if running user's usedID is mentioned
 *
 * Not good example with current servers. This example will change your current online status
 */
@Slf4j
public class DebugPresence {
    static ContactsResponse contacts;
    static CreateSessionResponse session;

    public static void main(String[] args) throws Exception {
        log.info("Tracks precense of user");
        RestUserEndpoints endpoints = Tool.init(false);
        log.info("User id is {}" + Tool.lr.session.userID);

        //contacts = endpoints.contacts.get().get();
        session = endpoints.session.create(new CreateSessionRequest(CurseGUID.newRandomUUID(), DevicePlatform.UNKNOWN)).get();

        TrackPresenceTask task = new TrackPresenceTask(session.user.userID);

        WebSocket webSocket = new WebSocket(Tool.lr, session, new URI(Apis.NOTIFICATIONS));
        webSocket.addTask(task, NotificationsServiceContractType.GROUP_PRESENCE_NOTIFICATION);
        webSocket.start();
    }

    private static class TrackPresenceTask implements Task<GroupPresenceNotification> {
        private long uuid;

        public TrackPresenceTask(long uuid) {
            this.uuid = uuid;
        }

        @Override
        public void execute(@Nonnull WebSocket webSocket, @Nonnull GroupPresenceNotification response) {
            if (response.users.stream().anyMatch(user -> user.userID == uuid)) {
                log.info("{}", response);
            }
        }
    }
}
