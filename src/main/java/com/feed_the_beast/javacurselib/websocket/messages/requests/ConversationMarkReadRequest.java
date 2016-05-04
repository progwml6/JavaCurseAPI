package com.feed_the_beast.javacurselib.websocket.messages.requests;

import java.util.Date;

public class ConversationMarkReadRequest extends BaseRequest implements Request {
    public transient int typeID = -342895375;
    public String conversationID;   // TODO: use UUIDs or  Strings?
    public Date timestamp;          // TODO: check

    @Override
    public int getTypeID() {
        return typeID;
    }
}
