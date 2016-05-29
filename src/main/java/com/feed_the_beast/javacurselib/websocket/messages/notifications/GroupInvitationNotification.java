package com.feed_the_beast.javacurselib.websocket.messages.notifications;

import com.feed_the_beast.javacurselib.service.contacts.contacts.GroupNotification;

public class GroupInvitationNotification extends BaseResponse implements Response {
    public String inviteCode;
    public long creatorID;
    public String creatorName;
    public String groupID;
    public GroupNotification group;
    public String channelID;
    public GroupNotification channel;
    public long dateCreated;
    public long dateExpires;   // optional
    public long maxUses;       // optional
    public long timesUsed;
    public boolean isRedeemable;
    public String inviteUrl;
    public String adminDescription;
}
