package com.feed_the_beast.javacurselib.service.contacts.contacts;

import com.feed_the_beast.javacurselib.common.classes.FriendshipContract;

import java.util.List;

/**
 * representation of curse contacts api ContactsResponse
 */
public class ContactsResponse {
    public List<FriendshipContract> friends;
    public List<GroupNotification> groups;
}
