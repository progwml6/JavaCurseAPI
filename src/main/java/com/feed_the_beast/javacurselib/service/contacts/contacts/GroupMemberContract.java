package com.feed_the_beast.javacurselib.service.contacts.contacts;

/**
 * representation of curse contact api GroupMemberContract
 */
public class GroupMemberContract {
    public int UserID;
    public String Username;
    public int BestRole;
    public int[] Roles;
    public int DateJoined;
    public UserConnectionStatus ConnectionStatus;
    public int DateLastSeen;
    public int DateLastActive;
    public boolean IsActive;
    public int CurrentGameID;
    public boolean IsVoiceMuted;
    public boolean isVoiceDeafened;

}
