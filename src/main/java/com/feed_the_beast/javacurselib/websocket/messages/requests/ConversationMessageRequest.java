package com.feed_the_beast.javacurselib.websocket.messages.requests;

public class ConversationMessageRequest extends BaseRequest implements Request {
    public String conversationID;   // TODO: use UUIDs or  Strings?
    public String attachmentID;
    public String clientID;
    public String message;

    @Override
    public RequestsServiceContractType getTypeID() {
        return RequestsServiceContractType.CONVERSATION_MESSAGE_REQUEST;
    }
}