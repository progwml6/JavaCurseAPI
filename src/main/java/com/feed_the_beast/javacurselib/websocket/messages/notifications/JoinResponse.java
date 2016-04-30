package com.feed_the_beast.javacurselib.websocket.messages.notifications;

import java.util.Date;

public class JoinResponse extends BaseResponse implements Response {
    public int Status;
    public Date ServerTime;
    public String EncryptedSessionKey;
}
