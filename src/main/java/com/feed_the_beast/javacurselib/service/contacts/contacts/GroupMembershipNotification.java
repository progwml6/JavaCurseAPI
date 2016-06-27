package com.feed_the_beast.javacurselib.service.contacts.contacts;

import com.feed_the_beast.javacurselib.common.enums.NotificationPreference;
import lombok.ToString;

import java.util.Date;
import java.util.List;

/**
 * representation of curse contact api GroupMembershipNotification
 */
@ToString
public class GroupMembershipNotification {
    public int bestRole;
    public int[] roles;
    public Date dateJoined;
    public Date dateMessaged;
    public Date dateRead;
    public int unreadCount;
    public boolean isFavorite;
    public NotificationPreference notificationPreference;
    public List<String> notificationFilters;
    public Date notificationMuteDate;
    public boolean isVoiceMuted;
    public boolean isVoiceDeafened;
}
