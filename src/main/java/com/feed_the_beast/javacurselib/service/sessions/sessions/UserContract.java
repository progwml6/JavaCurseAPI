package com.feed_the_beast.javacurselib.service.sessions.sessions;

import com.feed_the_beast.javacurselib.service.contacts.contacts.UserConnectionStatus;

import java.util.Date;

/**
 * representation of curse sessions api UserContract
 */
public class UserContract {
    public int UserID;
    public String Username;
    public UserConnectionStatus ConnectionStatus;
    public String CustomStatusMessage;
    public Date CustomStatusTimestamp;
    public int FriendCount;
    public String AvatarUrl;
    public int CurrentGameID;
    public int CurrentGameState;
    public String CurrentGameStatusMEssage;
    public Date CurrentGameTimestamp;
    public PushNotificationPreference GroupMessagePushPreference;
    public PushNotificationPreference FriendMessagePushPreference;
    public boolean FriendRequestPushEnabled;
    public boolean MentionsPushEnabled;
}
