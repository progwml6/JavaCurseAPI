package com.feed_the_beast.javacurselib.websocket.messages.notifications;

import com.feed_the_beast.javacurselib.common.classes.GroupGiveawayNotification;
import com.feed_the_beast.javacurselib.common.classes.GroupGiveawayRollContract;
import com.feed_the_beast.javacurselib.common.enums.GroupGiveawayChangeType;
import com.feed_the_beast.javacurselib.common.classes.GroupMemberContract;
import lombok.ToString;

@ToString
public class GroupGiveawayChangedNotification extends BaseResponse implements Response {
    public long timeStamp;
    public GroupGiveawayChangeType changeType;
    public GroupGiveawayNotification groupGiveawayNotification; // TODO: check this. seems to be null
    public GroupMemberContract affectedUser;
    public GroupMemberContract requestor;
    public GroupGiveawayRollContract currentRoll;
    public GroupGiveawayRollContract[] rolls;
}
