package com.feed_the_beast.javacurselib.websocket.messages.notifications.classes;

import com.feed_the_beast.javacurselib.common.enums.UserConnectionStatus;
// TODO: decide where this class belongs. RI has it in websocket
// used by both websocket and REST interface. Probably best location is common/classes

public class GroupMemberContract {
    long userID;
    String username;
    long bestRole;
    long[] roles;
    long dateJoined;
    UserConnectionStatus connectionStatus;
    long dateLastSeen;
    long dateLastActive;
    boolean isActive;
    long currentGameID;
    boolean isVoiceMuted;
    boolean isVoiceDeafened;
}
