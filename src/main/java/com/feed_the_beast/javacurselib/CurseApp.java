package com.feed_the_beast.javacurselib;

import com.feed_the_beast.javacurselib.service.contacts.contacts.ChannelContract;
import com.feed_the_beast.javacurselib.service.contacts.contacts.ContactsResponse;
import com.feed_the_beast.javacurselib.service.contacts.contacts.GroupNotification;
import com.feed_the_beast.javacurselib.service.logins.login.LoginRequest;
import com.feed_the_beast.javacurselib.service.logins.login.LoginResponse;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionRequest;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionResponse;
import com.feed_the_beast.javacurselib.service.sessions.sessions.DevicePlatform;
import com.feed_the_beast.javacurselib.utils.NetworkRequest;
import com.feed_the_beast.javacurselib.websocket.WebSocketStarter;

import java.util.UUID;

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

    public static CreateSessionResponse getSession (String token, UUID machinekey, DevicePlatform platform) {
        String jsonToSend = JsonFactory.GSON.toJson(new CreateSessionRequest(machinekey, platform));
        String str = NetworkRequest.postJson(Apis.SESSIONS +"sessions", jsonToSend, token);
        return JsonFactory.GSON.fromJson(str, CreateSessionResponse.class);
    }

    public static void main (String args[]) {
        LoginResponse lr = login(args[0], args[1]);
        ContactsResponse cr = getContacts(lr.Session.Token);
        CreateSessionResponse sessionResponse = getSession(lr.Session.Token, UUID.randomUUID(), DevicePlatform.UNKNOWN);
        for (GroupNotification g : cr.Groups) {
            if (g.GroupTitle.equals("CurseForge")) {
                for (ChannelContract c : g.Channels) {
                    if (c.GroupTitle.equals("app-api-chat")) {
                        System.out.println("you probably have access to this magical API Channel if you are seeing this code");
                    }
                }
            }
        }
        System.out.println(sessionResponse.SessionID);

        WebSocketStarter.start(lr, sessionResponse, Apis.NOTIFICATIONS);
    }
}
