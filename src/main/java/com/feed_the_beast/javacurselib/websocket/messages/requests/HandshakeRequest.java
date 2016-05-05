package com.feed_the_beast.javacurselib.websocket.messages.requests;

/*
 * Called Handshake in RI, shared with Response
 */
public class HandshakeRequest extends BaseRequest implements Request {
    public transient static HandshakeRequest PING = new HandshakeRequest();
    public boolean signal = true;

    @Override
    public RequestsServiceContractType getTypeID() {
        return RequestsServiceContractType.HANDSHAKE;
    }
}
