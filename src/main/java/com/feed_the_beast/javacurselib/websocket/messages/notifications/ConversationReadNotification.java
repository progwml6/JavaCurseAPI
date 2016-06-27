package com.feed_the_beast.javacurselib.websocket.messages.notifications;


import com.feed_the_beast.javacurselib.utils.CurseGUID;
import lombok.ToString;

import java.util.Date;

/*
 * Notes: "Timestamp":"0001-01-01T00:00:00Z" is used when user does "Mark as read in other client"
 * Does server change null time stamps to that?
 */
@ToString
public class ConversationReadNotification extends BaseResponse implements Response {
    public CurseGUID groupID;
    public long friendID;
    public Date timestamp;
    public CurseGUID conversationID;
}
