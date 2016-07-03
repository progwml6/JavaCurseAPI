package com.feed_the_beast.javacurselib.websocket.messages.notifications;

import com.feed_the_beast.javacurselib.common.classes.ExternalAccountContract;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.enums.ExternalAccountChangeType;
import lombok.ToString;

@ToString
public class ExternalAccountChangedNotification extends BaseResponse implements Response {
    public ExternalAccountChangeType changeType;
    public ExternalAccountContract account;
}
