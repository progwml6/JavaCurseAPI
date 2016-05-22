package com.feed_the_beast.javacurselib.service.contacts.users;

import com.feed_the_beast.javacurselib.common.enums.*;
import com.google.gson.annotations.SerializedName;

/**
 * representation of curse contact api UserProfileNotification
 */
public class FriendHintContract {
    @SerializedName("ID")
    public int id;
    public int userID;
    public int searchTerm;
    public FriendHintType type;
    public int gameID;
    public String region;
    public String server;
    public String site;
    public FriendPlatform platform;
    public String displayName;
    public String avatarUrl;
    public String description;
    public FriendHintVerification verification;
    public FriendHintStatus status;
    public FriendHintVisibility visibility;
}
