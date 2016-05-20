package com.feed_the_beast.javacurselib.service.contacts.users;

import java.util.Arrays;

/**
 * representation of curse contact api MutualFriendNotification
 */
public class MutualFriendNotification {
    public long userID;
    public long[] mutualUserIDs;

    @Override
    public String toString() {
        return "MutualFriendNotification{" +
                "userID=" + userID +
                ", mutualUserIDs=" + Arrays.toString(mutualUserIDs) +
                '}';
    }
}
