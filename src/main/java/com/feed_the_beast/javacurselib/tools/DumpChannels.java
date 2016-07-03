package com.feed_the_beast.javacurselib.tools;

import com.feed_the_beast.javacurselib.rest.RestUserEndpoints;
import com.feed_the_beast.javacurselib.service.contacts.contacts.ContactsResponse;
import com.feed_the_beast.javacurselib.service.contacts.contacts.GroupNotification;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DumpChannels {
    public static void main(String[] args) throws Exception {
        log.info("Basic information about known groups and non-deleted channels:");
        RestUserEndpoints endpoints = Tool.init();

        /*
         * get generic contact information
         *
         * Collection of GroupNotification does not include following information:
         *   roles -  Collection of GroupRoleNotification, includes roleid <-> rolename mapping
         *   members - Collection of GroupMemberContract, includes name <-> nick <-> userID mapping
         *
         */

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
