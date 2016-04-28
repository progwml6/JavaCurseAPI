package com.feed_the_beast.javacurselib.service.contacts.contacts;

import java.util.Date;
import java.util.List;

/**
 * representation of curse contact api ChannelMembershipContract
 */
public class ChannelMembershipContract {
    public Date DateMessaged;
    public Date DateRead;
    public int UnreadCount;
    public boolean IsFavorite;
    public NotificationPreference NotificationPreference;
    public List<String> NotificationFilters;
    public Date NotificationMuteDate;
}
