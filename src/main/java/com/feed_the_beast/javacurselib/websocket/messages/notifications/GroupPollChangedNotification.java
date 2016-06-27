package com.feed_the_beast.javacurselib.websocket.messages.notifications;

import com.feed_the_beast.javacurselib.common.classes.GroupPollNotification;
import com.feed_the_beast.javacurselib.common.enums.GroupPollChangeType;
import lombok.ToString;

@ToString
public class GroupPollChangedNotification extends BaseResponse implements Response {
    public GroupPollChangeType changeType;
    public GroupPollNotification poll;
    public long requestorUserID;
}
