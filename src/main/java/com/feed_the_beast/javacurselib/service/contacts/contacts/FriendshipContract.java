package com.feed_the_beast.javacurselib.service.contacts.contacts;

import java.util.Date;

/**
 * representation of curse contacts api FriendshipContract
 */
public class FriendshipContract {
    public FriendshipStatus Status;
    public int OtherUserID;
    public String OtherUsername;
    public String otherUserNickname;
    public int otherUserRegionID;//TODO find out what these actually are and put into an enum!!
    public UserConnectionStatus OtherUserConnectionStatus;
    public String InvitationMessage;
    public boolean IsFavorite;
    public int OtherUserGameID;//TODO find out what these actually are and put into an enum!!
    public String OtherUserGameStatusMessage;
    public int OtherUserGameState;//TODO find out what these actually are and put into an enum!!
    public Date OtherUserGameTimestamp;
    public String OtherUserAvatarUrl;
    public Date DateConfirmed;
    public Date DateMessaged;
    public Date DateRead;
    public int UnreadCount;
    public int MutualFriendCount;
    public int OtherUserConnectionStatusTimestamp;
    public int RequestedTimestamp;
}
