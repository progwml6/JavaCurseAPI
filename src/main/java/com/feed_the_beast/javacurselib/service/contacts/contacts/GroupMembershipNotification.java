package com.feed_the_beast.javacurselib.service.contacts.contacts;

import java.util.Date;
import java.util.List;

/**
 * representation of curse contact api GroupMembershipNotification
 */
public class GroupMembershipNotification {
    public int BestRole;
    public int[] Roles;
    public Date DateJoined;
    public Date DateMessaged;
    public Date DateRead;
    public int UnreadCount;
    public boolean isFavorite;
    public NotificationPreference NotificationPreference;
    public List<String> NotificationFilters;
    public Date NotificationMuteDate;
    public boolean IsVoiceMuted;
    public boolean IsVoiceDeafened;
}
