package com.feed_the_beast.javacurselib.websocket.messages.notifications;

import com.feed_the_beast.javacurselib.common.enums.NotificationPreference;

import java.util.Date;

public class GroupPreferenceNotification extends BaseResponse implements Response {
    public String groupID;
    public NotificationPreference preference;
    public boolean isFavorite;
    public Date timestamp;
}
