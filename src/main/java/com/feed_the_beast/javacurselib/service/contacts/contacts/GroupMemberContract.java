package com.feed_the_beast.javacurselib.service.contacts.contacts;

/**
 * representation of curse contact api GroupMemberContract
 */
public class GroupMemberContract {
    public int userID;
    public String username;
    public int bestRole;
    public int[] roles;
    public int dateJoined;
    public UserConnectionStatus connectionStatus;
    public int dateLastSeen;
    public int dateLastActive;
    public boolean isActive;
    public int currentGameID;
    public boolean isVoiceMuted;
    public boolean isVoiceDeafened;

}