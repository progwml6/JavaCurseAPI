package com.feed_the_beast.javacurselib.service.contacts.contacts;

import java.util.Date;

/**
 * representation of curse contacts api FriendshipContract
 */
public class FriendshipContract {
    public FriendshipStatus status;
    public int otherUserID;
    public String otherUsername;
    public String otherUserNickname;
    public int otherUserRegionID;//TODO find out what these actually are and put into an enum!!
    public UserConnectionStatus otherUserConnectionStatus;
    public String invitationMessage;
    public boolean isFavorite;
    public int otherUserGameID;//TODO find out what these actually are and put into an enum!!
    public String otherUserGameStatusMessage;
    public int otherUserGameState;//TODO find out what these actually are and put into an enum!!
    public Date otherUserGameTimestamp;
    public String otherUserAvatarUrl;
    public Date dateConfirmed;
    public Date dateMessaged;
    public Date dateRead;
    public int unreadCount;
    public int mutualFriendCount;
    public long otherUserConnectionStatusTimestamp;//TODO use date instead
    public long requestedTimestamp;//TODO use date instead
}
