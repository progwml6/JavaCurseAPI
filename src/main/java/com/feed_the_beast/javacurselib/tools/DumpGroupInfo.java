package com.feed_the_beast.javacurselib.tools;

import com.feed_the_beast.javacurselib.common.classes.GroupMemberContract;
import com.feed_the_beast.javacurselib.rest.RestUserEndpoints;
import com.feed_the_beast.javacurselib.service.contacts.contacts.ContactsResponse;
import com.feed_the_beast.javacurselib.service.contacts.contacts.GroupNotification;
import com.feed_the_beast.javacurselib.service.groups.groups.GroupMemberSearchRequest;
import com.feed_the_beast.javacurselib.utils.CurseGUID;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Slf4j
public class DumpGroupInfo {
    public static void main(String[] args) throws Exception {
        RestUserEndpoints endpoints = Tool.init();

        ContactsResponse cr = endpoints.contacts.get().get();
        CurseGUID id = CurseGUID.newFromString(args[0]);
        GroupNotification gn = endpoints.groups.get(id, false).get();
        gn.channels.stream().sorted((a, b) -> Integer.compare(a.displayOrder, b.displayOrder))
                .forEach(c -> {
                    log.info("{} ID: {}", c.groupTitle, c.groupID);
                    log.debug("\tcat: {} catID: {} catRank: {} order: {}", c.displayCategory, c.displayCategoryID, c.displayCategoryRank, c.displayOrder);
                });

        if ( args.length > 1 && args[1].equalsIgnoreCase("getmembers")) {
            List<GroupMemberContract> amembers = getMembers(id, true, endpoints);
            log.info("Group {} has total {} active members", cr.getGroupNamebyId(id).get(),  amembers.size());
            log.info("Active members: {}", sortedMembers(amembers));

            List<GroupMemberContract> members = getMembers(id, false, endpoints);
            log.info("Group {} has total {} inactive members", cr.getGroupNamebyId(id).get(),  members.size());
            log.info("Members: {}", sortedMembers(members));
        }

        // parallel version?
        if ( args.length > 1 && args[1].equalsIgnoreCase("searchMembers")) {
            int memberCount = cr.groups.stream().filter(g -> g.groupID.equals(id)).findFirst().get().memberCount;

            long now = System.currentTimeMillis();
            List<GroupMemberContract> members = searchMembers(id, endpoints, memberCount);
            log.info("{} ms", System.currentTimeMillis() - now);
            log.info("Group {} has total {} total members", cr.getGroupNamebyId(id).get(),  members.size());
            log.info("Member names: {}", sortedMembers(members));
        }

        // normal
        if ( args.length > 1 && args[0].equalsIgnoreCase("searchMembers2")) {
            int memberCount = cr.groups.stream().filter(g -> g.groupID.equals(id)).findFirst().get().memberCount;

            long now = System.currentTimeMillis();
            List<GroupMemberContract> members = searchMembers2(id, endpoints);
            log.info("{} ms", System.currentTimeMillis() - now);
            log.info("Group {} has total {} total members", cr.getGroupNamebyId(id).get(),  members.size());
            log.info("Member names: {}", sortedMembers(members));
        }

        System.exit(0);
    }

    private static List<GroupMemberContract> getMembers(CurseGUID id, boolean actives, RestUserEndpoints endpoints) throws Exception {
        int page = 1;
        List<GroupMemberContract> members = endpoints.groups.getMembers(id, actives, page, 50).get();
        List<GroupMemberContract> allMembers = Lists.newArrayList();
        do {
            allMembers.addAll(members);
            page = page +1;
            members = endpoints.groups.getMembers(id, actives, page, 50).get();
        } while (members.size() > 0);

        return allMembers;
    }

    private static List<GroupMemberContract> searchMembers(CurseGUID id, RestUserEndpoints endpoints, int memberCount) throws Exception {
        // we know that default pageSize is 100 in GroupMemberSearchRequest
        int pages = (int) Math.ceil(memberCount / 100.0);

        Set<GroupMemberSearchRequest> requests = IntStream.range(1, pages + 1).mapToObj(GroupMemberSearchRequest::new).collect(Collectors.toSet());
        List<GroupMemberContract> allMembers = Lists.newArrayList(); // probably not thread-sfe design

        requests.parallelStream().forEach(request -> {
            try {
                allMembers.addAll(endpoints.groups.searchMembers(id, request).get());
            } catch (Exception e) {
            }
        });

        return allMembers;
    }

    private static List<GroupMemberContract> searchMembers2(CurseGUID id, RestUserEndpoints endpoints) throws Exception {
        int page = 1;
        GroupMemberSearchRequest request = new GroupMemberSearchRequest(page);

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

    public static String sortedMembers(List<GroupMemberContract> members) {
        return members.stream().map(member -> member.username).sorted().collect(Collectors.joining(", "));
    }
}
