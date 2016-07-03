package com.feed_the_beast.javacurselib.websocket.messages.notifications;

import com.feed_the_beast.javacurselib.common.enums.GroupChangeType;
import com.feed_the_beast.javacurselib.common.enums.GroupMemberRemovedReason;
import com.feed_the_beast.javacurselib.common.classes.GroupMemberContract;
import com.feed_the_beast.javacurselib.service.contacts.contacts.ChannelContract;
import com.feed_the_beast.javacurselib.service.contacts.contacts.GroupNotification;
import lombok.ToString;

import java.util.Date;
import java.util.List;
import java.util.Set;

@ToString
public class GroupChangeNotification extends BaseResponse implements Response {
    public GroupChangeType changeType;          // this probably tells which data to update
    public long senderID;                       // user who triggered this even
    public String senderName;                   // -- "" --
    public GroupNotification group;             // affected group
    public List<GroupMemberContract> members;   // list of aacedted members?
    public Date timeStamp;
    public Set<ChannelContract> childGroups;    // TODO: ?
    public GroupMemberRemovedReason removedReason;
    public String messageToUsers;               // TODO: ?
}
