package com.feed_the_beast.javacurselib.service.sessions.sessions;

import com.feed_the_beast.javacurselib.common.enums.PushNotificationPreference;
import com.feed_the_beast.javacurselib.common.enums.UserConnectionStatus;
import lombok.ToString;

import java.util.Date;

/**
 * representation of curse sessions api UserContract
 */
@ToString
public class UserContract {
    public int userID;
    public String username;
    public UserConnectionStatus connectionStatus;
    public String customStatusMessage;
    public Date customStatusTimestamp;
    public int friendCount;
    public String avatarUrl;
    public int currentGameID;
    public int currentGameState;
    public String currentGameStatusMessage;
    public Date currentGameTimestamp;
    public PushNotificationPreference groupMessagePushPreference;
    public PushNotificationPreference friendMessagePushPreference;
    public boolean friendRequestPushEnabled;
    public boolean mentionsPushEnabled;
}
