package com.feed_the_beast.javacurselib.websocket.messages.requests;

import javax.annotation.Nonnull;
import java.util.Date;
import java.util.UUID;

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
