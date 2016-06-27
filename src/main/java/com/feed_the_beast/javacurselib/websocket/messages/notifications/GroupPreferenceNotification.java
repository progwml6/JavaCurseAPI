package com.feed_the_beast.javacurselib.websocket.messages.notifications;

import com.feed_the_beast.javacurselib.common.enums.NotificationPreference;
import lombok.ToString;

import java.util.Date;

@ToString
public class GroupPreferenceNotification extends BaseResponse implements Response {
    public String groupID;
    public NotificationPreference preference;
    public boolean isFavorite;
    public Date timestamp;
}
