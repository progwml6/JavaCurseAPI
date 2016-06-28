package com.feed_the_beast.javacurselib.tools;

import com.feed_the_beast.javacurselib.data.JsonFactory;
import com.feed_the_beast.javacurselib.rest.RestUserEndpoints;
import com.feed_the_beast.javacurselib.service.contacts.contacts.ChannelContract;
import com.feed_the_beast.javacurselib.service.contacts.contacts.ContactsResponse;
import com.feed_the_beast.javacurselib.service.contacts.contacts.GroupNotification;
import com.feed_the_beast.javacurselib.service.logins.login.LoginResponse;
import lombok.extern.slf4j.Slf4j;
import okhttp3.logging.HttpLoggingInterceptor;

import java.nio.file.Files;
import java.nio.file.Paths;

@Slf4j
public class DumpChannels {
    public static void main(String[] args) throws Exception {
        String s = new String(Files.readAllBytes(Paths.get(args[0])));
        LoginResponse lr = JsonFactory.GSON.fromJson(s, LoginResponse.class);

        // start creating REST endpoints
        RestUserEndpoints endpoints = new RestUserEndpoints();
        endpoints.addInterceptor(new HttpLoggingInterceptor(new Slf4jHttpLoggingInterceptor()).setLevel(HttpLoggingInterceptor.Level.BODY));
        endpoints.setAuthToken(lr.session.token);
        endpoints.setupEndpoints();

        ContactsResponse cr = endpoints.contacts.get().get();

        for (GroupNotification g : cr.groups) {
            log.info("{} {}", g.groupTitle, g.groupID);
            log.debug("{}", g);
            for (ChannelContract c : g.channels) {
                log.info("\t{} {}", c.groupTitle, c.groupID);
            }
        }

        // compare data with server...
        for (GroupNotification g : cr.groups) {
            if (log.isDebugEnabled()) { // fetch data only if logging level enabled
                GroupNotification gn = endpoints.groups.get(g.groupID, false).get();
                log.debug("{}", gn);
            }
        }
    }
}
