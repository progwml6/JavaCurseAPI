package com.feed_the_beast.javacurselib.common.classes;

import com.feed_the_beast.javacurselib.common.enums.UserConnectionStatus;
import lombok.ToString;

/**
 * representation of curse contact api GroupMemberContract
 */
@ToString
public class GroupMemberContract {
    public long userID;
    public String username;
    public int bestRole;
    public int[] roles;
    public long dateJoined;
    public UserConnectionStatus connectionStatus;
    public long dateLastSeen;
    public long dateLastActive;
    public boolean isActive;
    public int currentGameID;
    public boolean isVoiceMuted;
    public boolean isVoiceDeafened;

}
