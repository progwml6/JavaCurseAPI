package com.feed_the_beast.javacurselib.websocket.messages.notifications;

import com.feed_the_beast.javacurselib.service.sessions.sessions.UserContract;
import lombok.ToString;

@ToString
public class CallRespondedNotification extends BaseResponse implements Response {
    public UserContract user;
}
