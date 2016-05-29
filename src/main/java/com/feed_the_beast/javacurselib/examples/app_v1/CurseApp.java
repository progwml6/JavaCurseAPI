package com.feed_the_beast.javacurselib.examples.app_v1;

import com.feed_the_beast.javacurselib.service.contacts.users.UserProfileNotification;
import com.feed_the_beast.javacurselib.utils.CurseGUID;
import com.feed_the_beast.javacurselib.data.Apis;
import com.feed_the_beast.javacurselib.data.JsonFactory;
import com.feed_the_beast.javacurselib.service.contacts.contacts.ChannelContract;
import com.feed_the_beast.javacurselib.service.contacts.contacts.ContactsResponse;
import com.feed_the_beast.javacurselib.common.classes.FriendshipContract;
import com.feed_the_beast.javacurselib.service.contacts.contacts.GroupNotification;
import com.feed_the_beast.javacurselib.service.groups.bans.GroupBannedUserContract;
import com.feed_the_beast.javacurselib.service.logins.login.LoginRequest;
import com.feed_the_beast.javacurselib.service.logins.login.LoginResponse;
import com.feed_the_beast.javacurselib.rest.REST;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionRequest;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionResponse;
import com.feed_the_beast.javacurselib.common.enums.DevicePlatform;
import com.feed_the_beast.javacurselib.utils.NetworkRequest;
import com.feed_the_beast.javacurselib.websocket.WebSocket;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.NotificationsServiceContractType;
import com.google.common.collect.HashBiMap;
import retrofit2.adapter.java8.HttpException;


import java.net.URI;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;

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

    private static LoginResponse lr = null;;
    private static CreateSessionResponse sessionResponse = null;
    public static ContactsResponse contactsResponse = null;

    public static void main (String args[]) {
        /********
         * Login request: synchronous call (example)
         *******/

        try {
            String user = args.length >= 2 ? args[0] : System.getenv("JAVACURSEAPI_USER");
            String pass = args.length >= 2 ? args[1] : System.getenv("JAVACURSEAPI_PASS");
            lr = REST.login.login(new LoginRequest(user, pass)).get();
        } catch (InterruptedException e) {
            // should not happen, just ignore
        } catch (ExecutionException e) {
            if (e.getCause() instanceof HttpException) {
                System.out.println("Request failed: HTTP code: " + ((HttpException) e.getCause()).code());
                // TODO: add helper function(s) to verbosely debug fail reason(s) and/or check if retrofit/okhttp logging
            } else {
                // network or  parser error, just print exception with causes
                e.printStackTrace();
            }
            System.exit(1);
        }
        System.out.println("Synchronous login done: " + lr);

        // TODO: fix this by making REST fully non-static class and/or using other proper design patterns
        REST.setAuthToken(lr.session.token);


        /********
         * Session: Asynchronous call (example)
         *******/

        // create latch, extra synchronization to create sane example
        CountDownLatch sessionLatch = new CountDownLatch(1);

        CompletableFuture<CreateSessionResponse> createSessionResponseCompletableFuture = REST.session.create(new CreateSessionRequest(CurseGUID.newRandomUUID(), DevicePlatform.UNKNOWN));

        createSessionResponseCompletableFuture.whenComplete((r, e) -> {
            if (e != null) {
                if (e.getCause() instanceof HttpException) {
                    System.out.println("Request failed: HTTP code: " + ((HttpException) e.getCause()).code());
                    // TODO: see comment in login response
                } else {
                    // network or  parser error, just print exception with causes
                    e.printStackTrace();
                }
                System.exit(1);
            }

            // all is ok. Set value
            sessionResponse = r;
            // and make man thread to continue again
            sessionLatch.countDown();
        });

        // ugly code/synchronization just to implement example
        try {
            sessionLatch.await();
            // as soon as lock opened we know that sessionResponse is usable and it is safe to start websocket
        } catch (InterruptedException e) {
            System.exit(1);
            // should not happen, just ignore
        }
        System.out.println("Async session done: " + sessionResponse);

        /***************************
         *  experiment with data.
         ***************************/

        contactsResponse = REST.contacts.get().join(); // wil throw RuntimeException if fails
        for (GroupNotification g: contactsResponse.groups) {
            if (g.groupTitle.equals("CurseForge")) {
                for (ChannelContract c: g.channels) {
                    if (c.groupTitle.equals("app-api-chat")) {
                        System.out.println("you probably have access to this magical API Channel if you are seeing this code");
                    }
                }
            }
        }
        if (true) {
            System.out.println("WIP: contactResponse: " + contactsResponse);
        }


        UserProfileNotification myInfo = REST.users.getByID(sessionResponse.user.userID).join();
        System.out.println("my own user info: " + myInfo);

        /************************************
         *  websocket testing/example code
        *************************************/
        WebSocket ws = null;
        try {
            ws = new WebSocket(lr, sessionResponse, new URI(Apis.NOTIFICATIONS));
        } catch (Exception e) {
            System.out.println("failed");
            e.printStackTrace();
            System.exit(0);
        }

        ws.addTask(new DebugResponseTask(), NotificationsServiceContractType.CONVERSATION_MESSAGE_NOTIFICATION);
        ws.addTask(new DefaultResponseTask(), NotificationsServiceContractType.CONVERSATION_READ_NOTIFICATION);
        ws.addTask(new DebugResponseTask(), NotificationsServiceContractType.GROUP_CHANGE_NOTIFICATION);

        ws.addTask(new DebugResponseTask(), NotificationsServiceContractType.UNKNOWN);

        // to add your own handlers call ws.getResponseHandler() and configure it
        CountDownLatch latch = new CountDownLatch(1);
        ws.start();
        System.out.println("Websocket up and running, suspend thread");
        try {
            latch.await();
        } catch (InterruptedException e) {
        }
    }
}
