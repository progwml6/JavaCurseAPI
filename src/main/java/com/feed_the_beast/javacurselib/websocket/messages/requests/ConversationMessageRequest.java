package com.feed_the_beast.javacurselib.websocket.messages.requests;

public class ConversationMessageRequest extends BaseRequest implements Request {
    public transient int TypeID = -2124552136;
    public String ConversationID;   // TODO: use UUIDs or  Strings?
    public String AttachmentID;
    public String ClientID;
    public String Message;

    @Override
    public int getTypeID() {
        return TypeID;
    }
}