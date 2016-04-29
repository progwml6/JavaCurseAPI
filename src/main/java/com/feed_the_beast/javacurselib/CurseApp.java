package com.feed_the_beast.javacurselib;

import com.feed_the_beast.javacurselib.service.contacts.contacts.ChannelContract;
import com.feed_the_beast.javacurselib.service.contacts.contacts.ContactsResponse;
import com.feed_the_beast.javacurselib.service.contacts.contacts.GroupNotification;
import com.feed_the_beast.javacurselib.service.logins.login.LoginRequest;
import com.feed_the_beast.javacurselib.service.logins.login.LoginResponse;
import com.feed_the_beast.javacurselib.utils.NetworkRequest;

import java.util.Scanner;

/**
 * Created by progwml6 on 4/28/16.
 */
public class CurseApp {
    public static LoginResponse login(String username, String password) {
        LoginRequest lr = new LoginRequest(username, password);
        String jsonToSend = JsonFactory.GSON.toJson(lr);
        String s = NetworkRequest.postJson("https://logins-v1.curseapp.net/login", jsonToSend);
        LoginResponse ret = JsonFactory.GSON.fromJson(s ,LoginResponse.class);
        return ret;
    }
    public static ContactsResponse getContacts(String token) {
        //String str = NetworkRequest.executeGet("https://contacts-v1.curseapp.net/contacts", token);
        //System.out.println(str);
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        return JsonFactory.GSON.fromJson(str, ContactsResponse.class);
    }

    public static void main(String args[]) {
        LoginResponse lr = login(args[0], args[1]);
        ContactsResponse cr = getContacts(lr.Session.Token);
        for(GroupNotification g : cr.Groups) {
            if(g.GroupTitle.equals("CurseForge")){
                for (ChannelContract c : g.Channels) {
                    if(c.GroupTitle.equals("app-api-chat")) {
                        System.out.println("you have access to the magical API Channel :D");
                    } else {
                        System.out.println("you shouldn't have access to this code at all");
                    }
                }
            }
        }
    }
}
