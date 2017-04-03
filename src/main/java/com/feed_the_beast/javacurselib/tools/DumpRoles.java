package com.feed_the_beast.javacurselib.tools;

import com.feed_the_beast.javacurselib.common.classes.GroupMemberContract;
import com.feed_the_beast.javacurselib.rest.RestUserEndpoints;
import com.feed_the_beast.javacurselib.service.contacts.contacts.ContactsResponse;
import com.feed_the_beast.javacurselib.service.contacts.contacts.GroupNotification;
import com.feed_the_beast.javacurselib.service.groups.groups.GroupMemberSearchRequest;
import com.feed_the_beast.javacurselib.utils.CurseGUID;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;

import java.util.Comparator;
import java.util.List;

@Slf4j
public class DumpRoles {
    public static void main(String[] args) throws Exception {
        RestUserEndpoints endpoints = Tool.init();

        ContactsResponse cr = endpoints.contacts.get().get();
        GroupNotification groupNotification = cr.groups.stream().filter(g -> g.groupTitle.contains(args[0])).findAny().get();
        log.info("Examining group roles for {}, id {}", groupNotification.groupTitle, groupNotification.groupID);

        GroupNotification groupNotificationMOARINFO = endpoints.groups.get(groupNotification.groupID, false).get();

        // TODO: order by rank, make threaded
        // TODO: GroupMemberContract includes roles. One big fetch is enough, which one is faster?
        groupNotificationMOARINFO.roles.sort(Comparator.comparingInt(a -> a.rank)); // well it's sorted now. Mutable, not good
        groupNotificationMOARINFO.roles.forEach(role -> {
            if (role.name.equals("Guest")) {
                return;
            }
            log.debug("{}", role);
            log.info("Role name: {} Role Id: {} Role Rank: {}", role.name, role.roleID, role.rank);
            List<GroupMemberContract> members = null;
            try {
                members = searchMembers2(groupNotification.groupID, endpoints, role.roleID);
            } catch (Exception e) {}

            log.info("\t{}", DumpGroupInfo.sortedMembers(members));
        } );

        log.info("================================================================");

        groupNotificationMOARINFO.roles.forEach(role -> log.info("Role name: {}\nRole permissions: {}", role.name, groupNotificationMOARINFO.rolePermissions.get(role.roleID)));

        System.exit(0);
    }

    private static List<GroupMemberContract> searchMembers2(CurseGUID id, RestUserEndpoints endpoints, int roleID) throws Exception {
        int page = 1;
        GroupMemberSearchRequest request = new GroupMemberSearchRequest(page);
        request.roleID = roleID;

        List<GroupMemberContract> members = endpoints.groups.searchMembers(id, request).get();
        List<GroupMemberContract> allMembers = Lists.newArrayList();
        do {
            allMembers.addAll(members);
            page = page +1;
            request.page = page;
            members = endpoints.groups.searchMembers(id, request).get();
        } while (members.size() > 0);

        return allMembers;
    }

}
