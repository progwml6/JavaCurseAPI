package com.feed_the_beast.javacurselib.service.contacts.contacts;

import com.feed_the_beast.javacurselib.common.classes.FriendshipContract;
import com.feed_the_beast.javacurselib.utils.CurseGUID;
import lombok.ToString;

import java.util.List;

/**
 * representation of curse contacts api ContactsResponse
 */
@ToString
public class ContactsResponse {
    public List<FriendshipContract> friends;
    public List<GroupNotification> groups;

    public String getChannelNamebyId(CurseGUID id) {
        String ret = null;
        for (GroupNotification gn : groups) {
            ret = gn.getChannelNamebyId(id);
            if (ret != null) {
                return ret;
            }
        }
        return null;
    }

    public CurseGUID getChannelIdByName(String s) {
        CurseGUID ret;
        for (GroupNotification gn : groups) {
            ret = gn.getChannelIdByName(s);
            if (ret != null) {
                return ret;
            }
        }
        return null;
    }
}
