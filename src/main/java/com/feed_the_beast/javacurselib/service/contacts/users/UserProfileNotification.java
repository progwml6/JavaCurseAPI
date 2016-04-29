package com.feed_the_beast.javacurselib.service.contacts.users;

import java.util.List;

/**
 * representation of curse contact api UserProfileNotification
 */
public class UserProfileNotification {
    public int UserID;
    public String Username;
    public String Name;
    public String City;
    public String State;
    public String CountryCode;
    public String AboutMe;
    public int FriendCount;
    public int lastGameID;
    public List<FriendHintContract> Identities;
    public List<MutualFriendNotification> MutualFriends;
}
