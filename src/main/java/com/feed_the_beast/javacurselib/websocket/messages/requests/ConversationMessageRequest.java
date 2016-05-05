package com.feed_the_beast.javacurselib.websocket.messages.requests;

import javax.annotation.Nonnull;
import java.util.UUID;

public class ConversationMessageRequest extends BaseRequest implements Request {
    public UUID conversationID;   // TODO: use UUIDs or  Strings?
    public UUID attachmentID;
    public UUID clientID;
    public String message;

    public ConversationMessageRequest(@Nonnull  UUID conversationID, String message, @Nonnull UUID attachmentID) {
        this.conversationID = conversationID;
        this.attachmentID = attachmentID;
        this.message = message;             // TODO: test if null or empty messages are accepted
        this.clientID = UUID.randomUUID();
    }

    public ConversationMessageRequest(@Nonnull  UUID conversationID, String message) {
        this(conversationID, message, new UUID(0,0));
    }

    @Override
    public RequestsServiceContractType getTypeID() {
        return RequestsServiceContractType.CONVERSATION_MESSAGE_REQUEST;
    }
}