package com.feed_the_beast.javacurselib.websocket.messages.requests;

import lombok.ToString;

/*
 * Called Handshake in RI, shared with Response
 */
@ToString
public class HandshakeRequest extends BaseRequest implements Request {
    public transient static HandshakeRequest PING = new HandshakeRequest();
    public boolean signal = true;

    private HandshakeRequest() {
    }

    @Override
    public RequestsServiceContractType getTypeID() {
        return RequestsServiceContractType.HANDSHAKE;
    }
}
