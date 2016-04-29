package com.feed_the_beast.javacurselib.service.contacts.users;

/**
 * representation of curse contact api UserProfileNotification
 */
public class FriendHintContract {
    public int ID;
    public int UserID;
    public int SearchTerm;
    public FriendHintType Type;
    public int GameID;
    public String Region;
    public String Server;
    public String Site;
    public FriendPlatform Platform;
    public String DisplayName;
    public String AvatarUrl;
    public String Description;
    public FriendHintVerification Verification;
    public FriendHintStatus Status;
    public FriendHintVisibility Visibility;
}
