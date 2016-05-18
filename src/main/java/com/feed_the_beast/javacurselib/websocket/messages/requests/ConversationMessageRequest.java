package com.feed_the_beast.javacurselib.websocket.messages.requests;

import com.feed_the_beast.javacurselib.utils.CurseGUID;

import javax.annotation.Nonnull;

public class ConversationMessageRequest extends BaseRequest implements Request {
    public CurseGUID conversationID;
    public CurseGUID attachmentID;
    public CurseGUID clientID;
    public String message;

    public ConversationMessageRequest(@Nonnull CurseGUID conversationID, String message, @Nonnull CurseGUID attachmentID) {
        this.conversationID = conversationID;
        this.attachmentID = attachmentID;
        this.message = message;             // TODO: test if null or empty messages are accepted
        this.clientID = CurseGUID.newRandomUUID(); //TODO sohuld this be set as random further upstream?
    }

    public ConversationMessageRequest(@Nonnull CurseGUID conversationID, String message) {
        this(conversationID, message, CurseGUID.newFromZeroUUID());
    }

    @Override
    public RequestsServiceContractType getTypeID() {
        return RequestsServiceContractType.CONVERSATION_MESSAGE_REQUEST;
    }
}