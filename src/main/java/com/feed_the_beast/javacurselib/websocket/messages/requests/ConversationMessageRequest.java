package com.feed_the_beast.javacurselib.websocket.messages.requests;

import com.feed_the_beast.javacurselib.websocket.NotificationsServiceContractType;

public class ConversationMessageRequest extends BaseRequest implements Request {
    public transient NotificationsServiceContractType typeID = NotificationsServiceContractType.CONVERSATION_MESSAGE_REQUEST;
    public String conversationID;   // TODO: use UUIDs or  Strings?
    public String attachmentID;
    public String clientID;
    public String message;

    @Override
    public NotificationsServiceContractType getTypeID() {
        return typeID;
    }
}