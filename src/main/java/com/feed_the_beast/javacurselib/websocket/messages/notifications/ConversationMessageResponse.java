package com.feed_the_beast.javacurselib.websocket.messages.notifications;

import com.feed_the_beast.javacurselib.websocket.messages.notifications.enums.DeliveryStatus;

public class ConversationMessageResponse extends BaseResponse implements Response {
    public String conversationID;
    public DeliveryStatus status;
    public String clientID;
    public String serverID;
}
