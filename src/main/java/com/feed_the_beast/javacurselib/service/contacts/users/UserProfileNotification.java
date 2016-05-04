package com.feed_the_beast.javacurselib.service.contacts.users;

import java.util.List;

/**
 * representation of curse contact api UserProfileNotification
 */
public class UserProfileNotification {
    public int userID;
    public String username;
    public String name;
    public String city;
    public String state;
    public String countryCode;
    public String aboutMe;
    public int friendCount;
    public int lastGameID;
    public List<FriendHintContract> identities;
    public List<MutualFriendNotification> mutualFriends;
}
