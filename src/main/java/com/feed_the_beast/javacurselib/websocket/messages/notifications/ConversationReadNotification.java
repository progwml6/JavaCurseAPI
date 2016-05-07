package com.feed_the_beast.javacurselib.websocket.messages.notifications;


import java.util.Date;
import java.util.UUID;

/*
 * Notes: "Timestamp":"0001-01-01T00:00:00Z" is used when user does "Mark as read in other client"
 */

public class ConversationReadNotification extends BaseResponse implements Response {
    public UUID groupID;
    public long friendID;
    public Date timestamp;
    public UUID conversationID;
}
