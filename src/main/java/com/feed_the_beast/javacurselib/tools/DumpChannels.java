package com.feed_the_beast.javacurselib.tools;

import com.feed_the_beast.javacurselib.common.classes.GroupMemberContract;
import com.feed_the_beast.javacurselib.data.JsonFactory;
import com.feed_the_beast.javacurselib.rest.RestUserEndpoints;
import com.feed_the_beast.javacurselib.service.contacts.contacts.ChannelContract;
import com.feed_the_beast.javacurselib.service.contacts.contacts.ContactsResponse;
import com.feed_the_beast.javacurselib.service.contacts.contacts.GroupNotification;
import com.feed_the_beast.javacurselib.service.groups.groups.GroupMemberSearchRequest;
import com.feed_the_beast.javacurselib.service.logins.login.LoginResponse;
import com.feed_the_beast.javacurselib.utils.CurseGUID;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import okhttp3.logging.HttpLoggingInterceptor;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class DumpChannels {
    public static void main(String[] args) throws Exception {
        RestUserEndpoints endpoints = Tool.init();

        // get generic contact information
        ContactsResponse cr = endpoints.contacts.get().get();

        // TODO: fix this to properly support channel folders
        for (GroupNotification g : cr.groups) {
            log.info("{} {}", g.groupTitle, g.groupID);
            log.debug("{}", g);
            for (ChannelContract c : g.channels) {
                log.info("\t{} {}", c.groupTitle, c.groupID);
            }
        }

        // endpoints.groups.get offers more detailed information for given server than
        // ContactsResponse. Most important: roleID to RoleName mapping
        for (GroupNotification g : cr.groups) {
            if (log.isDebugEnabled()) { // fetch data only if logging level enabled
                GroupNotification gn = endpoints.groups.get(g.groupID, false).get();
                log.debug("{}", gn);
            }
        }
        System.exit(0);
    }
}
