package com.feed_the_beast.javacurselib.websocket.messages.notifications;

import com.feed_the_beast.javacurselib.websocket.messages.notifications.enums.JoinStatus;
import lombok.ToString;

import java.util.Date;

@ToString
public class JoinResponse extends BaseResponse implements Response {
    public JoinStatus status;
    public Date serverTime;
    public String encryptedSessionKey;
}
