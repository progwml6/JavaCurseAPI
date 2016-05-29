package com.feed_the_beast.javacurselib.websocket.messages.notifications;

import com.feed_the_beast.javacurselib.common.classes.FriendshipContract;

public class FriendshipChangeNotification extends BaseResponse implements Response {
    public FriendshipContract friendship;
}
