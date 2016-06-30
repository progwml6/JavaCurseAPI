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
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class DumpChannels {
    public static void main(String[] args) throws Exception {
        log.info("Basic information about known groups and non-deleted channels:");
        RestUserEndpoints endpoints = Tool.init();

        // get generic contact information
        ContactsResponse cr = endpoints.contacts.get().get();

        // TODO: fix this to properly support channel folders
        for (GroupNotification g : cr.groups) {
            log.info("{} {}", g.groupTitle, g.groupID);
            g.channels.stream().sorted((a, b) -> Integer.compare(a.displayOrder, b.displayOrder))
                    .forEach(c -> {
                        log.info("\t{} ID: {}", c.groupTitle, c.groupID);
                        log.debug("\t\tcat: {} catID: {} catRank: {} order: {}", c.displayCategory, c.displayCategoryID, c.displayCategoryRank, c.displayOrder);
                    });
        }

        System.exit(0);
    }
}
