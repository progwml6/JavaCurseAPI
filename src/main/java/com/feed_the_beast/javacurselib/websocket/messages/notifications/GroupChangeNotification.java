package com.feed_the_beast.javacurselib.websocket.messages.notifications;

import com.feed_the_beast.javacurselib.common.enums.GroupChangeType;
import com.feed_the_beast.javacurselib.common.enums.GroupMemberRemovedReason;
import com.feed_the_beast.javacurselib.common.classes.GroupMemberContract;
import com.feed_the_beast.javacurselib.service.contacts.contacts.GroupNotification;
import lombok.ToString;

import java.util.Date;
import java.util.Set;

@ToString
public class GroupChangeNotification extends BaseResponse implements Response {
    public GroupChangeType changeType;
    public long senderID;
    public String senderName;
    public GroupNotification group;
    public Set<GroupMemberContract> members;
    public Date timeStamp;
    public Set<GroupNotification> childGroups;
    public GroupMemberRemovedReason removedReason;
    public String messageToUsers;
}
