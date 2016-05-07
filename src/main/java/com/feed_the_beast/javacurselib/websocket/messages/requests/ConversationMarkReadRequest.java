package com.feed_the_beast.javacurselib.websocket.messages.requests;

import javax.annotation.Nonnull;
import java.util.Date;
import java.util.UUID;
/*
 * Notes: Official client sends this request without timestamp when user selects "Mark as read"
 *        => Null field handling?
 */
public class ConversationMarkReadRequest extends BaseRequest implements Request {
    public UUID conversationID;
    public Date timestamp;      // TODO: test. current implementation send longer timestamp than reference impl

    public ConversationMarkReadRequest(@Nonnull UUID conversationID) {
        this.conversationID = conversationID;
        this.timestamp = new Date(); //
    }

    @Override
    public RequestsServiceContractType getTypeID() {
        return RequestsServiceContractType.CONVERSATION_MARK_READ_REQUEST;
    }
}
