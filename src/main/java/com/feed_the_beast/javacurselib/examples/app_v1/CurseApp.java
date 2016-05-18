package com.feed_the_beast.javacurselib.examples.app_v1;

import com.feed_the_beast.javacurselib.utils.CurseGUID;
import com.feed_the_beast.javacurselib.data.Apis;
import com.feed_the_beast.javacurselib.data.JsonFactory;
import com.feed_the_beast.javacurselib.service.contacts.contacts.ChannelContract;
import com.feed_the_beast.javacurselib.service.contacts.contacts.ContactsResponse;
import com.feed_the_beast.javacurselib.service.contacts.contacts.FriendshipContract;
import com.feed_the_beast.javacurselib.service.contacts.contacts.GroupNotification;
import com.feed_the_beast.javacurselib.service.groups.bans.GroupBannedUserContract;
import com.feed_the_beast.javacurselib.service.logins.login.LoginRequest;
import com.feed_the_beast.javacurselib.service.logins.login.LoginResponse;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionRequest;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionResponse;
import com.feed_the_beast.javacurselib.service.sessions.sessions.DevicePlatform;
import com.feed_the_beast.javacurselib.utils.NetworkRequest;
import com.feed_the_beast.javacurselib.websocket.WebSocket;
import com.feed_the_beast.javacurselib.websocket.messages.handler.ResponseHandler;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.NotificationsServiceContractType;
import com.google.common.collect.HashBiMap;

import java.net.URI;
import java.util.concurrent.CountDownLatch;

import javax.annotation.Nullable;

/**
 * Created by progwml6 on 4/28/16.
 */
public class CurseApp {

    public static LoginResponse login (String username, String password) {
        LoginRequest lr = new LoginRequest(username, password);
        String jsonToSend = JsonFactory.GSON.toJson(lr);
        String s = NetworkRequest.postJson(Apis.LOGINS + "login", jsonToSend, null);
        LoginResponse ret = JsonFactory.GSON.fromJson(s, LoginResponse.class);
        return ret;
    }

    public static ContactsResponse getContacts (String token) {
        String str = NetworkRequest.getJson(Apis.CONTACTS + "contacts", token);
        return JsonFactory.GSON.fromJson(str, ContactsResponse.class);
    }

    public static CreateSessionResponse getSession (String token, CurseGUID machinekey, DevicePlatform platform) {
        String jsonToSend = JsonFactory.GSON.toJson(new CreateSessionRequest(machinekey, platform));
        String str = NetworkRequest.postJson(Apis.SESSIONS + "sessions", jsonToSend, token);
        return JsonFactory.GSON.fromJson(str, CreateSessionResponse.class);
    }

    private static HashBiMap<CurseGUID, String> channelNameIdPairs = HashBiMap.create();

    public static void generateChannelIdMappings (ContactsResponse cr) {
        for (FriendshipContract friend : cr.friends) {
            //int, string, string
            // friend.otherUserID, friend.otherUserNickname, friend.otherUserNickname
        }
        for (GroupNotification group : cr.groups) {
            for (ChannelContract channel : group.channels) {
                channelNameIdPairs.put(channel.groupID, group.groupTitle + "." + channel.groupTitle);//TODO should we make some sort of object for this
            }
        }
    }

    public static CurseGUID getChangelIDFromChannelName (ContactsResponse cr, @Nullable String serverName, String channelName) {
        if (channelNameIdPairs.isEmpty()) {
            generateChannelIdMappings(cr);
        }
        return channelNameIdPairs.inverse().get(serverName.equals(null) || serverName.isEmpty() ? channelName : serverName + "." + channelName);
    }

    public static String getChangelNameFromChannelID (ContactsResponse cr, CurseGUID guid) {
        if (channelNameIdPairs.isEmpty()) {
            generateChannelIdMappings(cr);
        }
        return channelNameIdPairs.get(guid);
    }

    /**
     *
     * @param serverID id of server to ban from
     * @param userID id of user to ban
     * @param reason reason that user is getting banned
     * @param token curse authentication token
     * @return GroupBannedUserContract with info about status of ban
     */
    public static GroupBannedUserContract banUser (CurseGUID serverID, int userID, String reason, String token) {
        String ret = NetworkRequest.postText(Apis.GROUPS + "servers/" + serverID.serialize() + "/bans/" + userID, reason, token);
        return JsonFactory.GSON.fromJson(ret, GroupBannedUserContract.class);
    }

    /**
     *
     * @param serverID id of server to ban user from
     * @param userID id of user to unban
     * @param token curse authentication token
     */
    public static void removeBan (CurseGUID serverID, int userID, String token) {
        NetworkRequest.sendDelete(Apis.GROUPS + "servers/" + serverID.serialize() + "/bans/" + userID, token);
    }

    /**
     *
     * @param conversationID id of the conversation
     * @param id id of the message
     * @param timestamp
     * @param token
     */
    public static void deleteMessage (String conversationID, String id, long timestamp, String token) {
        NetworkRequest.sendDelete(Apis.CONVERSATIONS + "conversations/" + conversationID + "/" + id + "-" + timestamp, token);
    }

    public static void main (String args[]) {
        LoginResponse lr = login(args[0], args[1]);
        ContactsResponse cr = getContacts(lr.session.token);
        CreateSessionResponse sessionResponse = getSession(lr.session.token, CurseGUID.newRandomUUID(), DevicePlatform.UNKNOWN);
        for (GroupNotification g : cr.groups) {
            if (g.groupTitle.equals("CurseForge")) {
                for (ChannelContract c : g.channels) {
                    if (c.groupTitle.equals("app-api-chat")) {
                        System.out.println("you probably have access to this magical API Channel if you are seeing this code");
                    }
                }
            }
        }
        System.out.println(sessionResponse.sessionID);

        // websocket testing code starts here
        WebSocket ws = null;
        try {
            ws = new WebSocket(lr, sessionResponse, new URI(Apis.NOTIFICATIONS));
        } catch (Exception e) {
            System.out.println("failed");
            e.printStackTrace();
            System.exit(0);
        }

        ResponseHandler responseHandler = ws.getResponseHandler();
        responseHandler.addTask(new DebugResponseTask(), NotificationsServiceContractType.CONVERSATION_MESSAGE_NOTIFICATION);
        responseHandler.addTask(new DefaultResponseTask(), NotificationsServiceContractType.CONVERSATION_READ_NOTIFICATION);

        responseHandler.addTask(new DebugResponseTask(), NotificationsServiceContractType.UNKNOWN);

        // to add your own handlers call ws.getResponseHandler() and configure it
        CountDownLatch latch = new CountDownLatch(1);
        ws.start();
        try {
            latch.await();
        } catch (InterruptedException e) {
        }
    }
}
