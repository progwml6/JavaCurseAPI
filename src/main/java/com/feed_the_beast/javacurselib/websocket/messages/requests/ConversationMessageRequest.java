package com.feed_the_beast.javacurselib.websocket.messages.requests;

public class ConversationMessageRequest extends BaseRequest implements Request {
    public transient int typeID = -2124552136;
    public String conversationID;   // TODO: use UUIDs or  Strings?
    public String attachmentID;
    public String clientID;
    public String message;

    @Override
    public int getTypeID() {
        return typeID;
    }
}