package com.feed_the_beast.javacurselib.websocket.messages.requests;

import com.feed_the_beast.javacurselib.CurseGUID;

import javax.annotation.Nonnull;
import java.util.Date;
/*
 * Notes: Official client sends this request without timestamp when user selects "Mark as read"
 *            => Null field handling?
 *        current implementation will send longer timestamp than reference impl
 */
public class ConversationMarkReadRequest extends BaseRequest implements Request {
    public CurseGUID conversationID;
    public Date timestamp;

    public ConversationMarkReadRequest(@Nonnull CurseGUID conversationID) {
        this.conversationID = conversationID;
        this.timestamp = new Date(); //
    }

    @Override
    public RequestsServiceContractType getTypeID() {
        return RequestsServiceContractType.CONVERSATION_MARK_READ_REQUEST;
    }
}
