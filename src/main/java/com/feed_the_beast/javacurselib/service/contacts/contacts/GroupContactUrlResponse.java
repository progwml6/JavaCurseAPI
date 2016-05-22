package com.feed_the_beast.javacurselib.service.contacts.contacts;

import com.feed_the_beast.javacurselib.common.enums.GroupSubType;

/**
 * representation of curse contacts api GroupContactUrlResponse
 */
public class GroupContactUrlResponse {
    public GroupSubType subtype;
    public String description;
    public boolean isPublic;
    public int memberCount;
}
