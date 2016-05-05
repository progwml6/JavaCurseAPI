package com.feed_the_beast.javacurselib.websocket.messages.requests;

// {"TypeID":-2124552136,"Body":{"ClientID":"b8df0506-5384-49c7-9eb4-9f9b03f2b8ea","ConversationID":"46a99533-2f0a-4bc0-bfb5-4621d904aed5",
// "Message":"kk","AttachmentID":"00000000-0000-0000-0000-000000000000"}}

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