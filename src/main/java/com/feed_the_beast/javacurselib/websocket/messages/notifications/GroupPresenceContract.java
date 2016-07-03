package com.feed_the_beast.javacurselib.websocket.messages.notifications;

import com.feed_the_beast.javacurselib.common.enums.UserConnectionStatus;
import lombok.ToString;

@ToString
public class GroupPresenceContract {
    public long userID;
    public UserConnectionStatus connectionStatus;
    public long gameID;
    public long dateLastSeen;
    public boolean isActive;
}
