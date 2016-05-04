package com.feed_the_beast.javacurselib.websocket.messages.requests;

import com.feed_the_beast.javacurselib.websocket.NotificationsServiceContractType;

import java.util.Date;

public class ConversationMarkReadRequest extends BaseRequest implements Request {
    public transient NotificationsServiceContractType typeID = NotificationsServiceContractType.CONVERSATION_MARK_READ_REQUEST ;
    public String conversationID;   // TODO: use UUIDs or  Strings?
    public Date timestamp;          // TODO: check

    @Override
    public NotificationsServiceContractType getTypeID() {
        return typeID;
    }
}
