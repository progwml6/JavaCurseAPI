package com.feed_the_beast.javacurselib.tools;

import com.feed_the_beast.javacurselib.common.classes.GroupMemberContract;
import com.feed_the_beast.javacurselib.data.JsonFactory;
import com.feed_the_beast.javacurselib.rest.RestUserEndpoints;
import com.feed_the_beast.javacurselib.service.contacts.contacts.ChannelContract;
import com.feed_the_beast.javacurselib.service.contacts.contacts.ContactsResponse;
import com.feed_the_beast.javacurselib.service.contacts.contacts.GroupNotification;
import com.feed_the_beast.javacurselib.service.logins.login.LoginResponse;
import com.feed_the_beast.javacurselib.utils.CurseGUID;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import okhttp3.logging.HttpLoggingInterceptor;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

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

        if (args.length > 1) {
            int page = 1;
            List<GroupMemberContract> amembers = getMembers(CurseGUID.deserialize(args[1]), true, endpoints);
            log.info("Group {} has total {} active members", cr.getGroupNamebyId(CurseGUID.deserialize(args[1])).get(),  amembers.size());
            log.debug("Active members: {}", amembers);

            List<GroupMemberContract> members = getMembers(CurseGUID.deserialize(args[1]), false, endpoints);
            log.info("Group {} has total {} inactive members", cr.getGroupNamebyId(CurseGUID.deserialize(args[1])).get(),  members.size());
            log.debug("Members: {}", members);

            if (args.length > 2) {
                log.info("User {} has userID {}", args[2], amembers.stream().filter(member -> member.username.equals(args[2])).findAny().get().userID);
                //log.info("User {} has userID {}", args[2], members.stream().filter(member -> member.username.equals(args[2])).findAny().get().userID);
            }
        }
        System.exit(0);
    }

    // TODO: make to use multiple threads
    // TODO: member count is mentioned somewhere. Use it
    private static List<GroupMemberContract> getMembers(CurseGUID id, boolean actives, RestUserEndpoints endpoints) throws Exception {
        int page = 1;
        List<GroupMemberContract> members = endpoints.groups.getMembers(id, actives, page, 50).get();
        List<GroupMemberContract> allMembers = Lists.newArrayList();
        do {
            log.debug("{}", members);
            allMembers.addAll(members);
            page = page +1;
            members = endpoints.groups.getMembers(id, actives, page, 50).get();
        } while (members.size() > 0);

        return allMembers;
    }
}
