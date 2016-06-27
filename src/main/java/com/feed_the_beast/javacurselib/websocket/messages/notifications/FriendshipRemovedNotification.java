package com.feed_the_beast.javacurselib.websocket.messages.notifications;

import lombok.ToString;

@ToString
public class FriendshipRemovedNotification extends BaseResponse implements Response {
    public long friendID;
}
