package com.feed_the_beast.javacurselib.websocket.messages.requests;

import com.feed_the_beast.javacurselib.websocket.NotificationsServiceContractType;

/*
 * Called Handshake in RI, shared with Response
 */
public class HandshakeRequest extends BaseRequest implements Request {
    public transient static HandshakeRequest PING = new HandshakeRequest();
    public transient NotificationsServiceContractType typeID = NotificationsServiceContractType.HANDSHAKE;
    public boolean signal = true;

    @Override
    public NotificationsServiceContractType getTypeID() {
        return typeID;
    }
}
