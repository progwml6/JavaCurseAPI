package com.feed_the_beast.javacurselib.websocket.messages.notifications;

import com.feed_the_beast.javacurselib.common.classes.FriendSuggestionContract;

public class FriendSuggestionNotification extends BaseResponse implements Response {
    public FriendSuggestionContract[] suggestions;
}
