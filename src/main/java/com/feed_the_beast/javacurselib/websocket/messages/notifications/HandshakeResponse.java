package com.feed_the_beast.javacurselib.websocket.messages.notifications;

import lombok.ToString;

@ToString
public class HandshakeResponse extends BaseResponse implements Response {
    public boolean signal;
}
