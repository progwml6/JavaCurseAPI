package com.feed_the_beast.javacurselib.websocket.messages.requests;

import java.util.Date;

public class ConversationMarkReadRequest extends BaseRequest implements Request {
    public transient int TypeID = -342895375;
    public String ConversationID;   // TODO: use UUIDs or  Strings?
    public Date Timestamp;          // TODO: check

    @Override
    public int getTypeID() {
        return TypeID;
    }
}
