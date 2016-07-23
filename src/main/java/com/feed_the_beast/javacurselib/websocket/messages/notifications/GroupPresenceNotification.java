package com.feed_the_beast.javacurselib.websocket.messages.notifications;

import com.feed_the_beast.javacurselib.utils.CurseGUID;
import lombok.ToString;

import java.util.List;

@ToString
public class GroupPresenceNotification extends BaseResponse implements Response {
    public CurseGUID groupID;
    public List<GroupPresenceContract> users;
}
