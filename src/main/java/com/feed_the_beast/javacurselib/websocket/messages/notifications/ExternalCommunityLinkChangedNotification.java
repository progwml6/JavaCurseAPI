package com.feed_the_beast.javacurselib.websocket.messages.notifications;


import com.feed_the_beast.javacurselib.common.enums.ExternalCommunityLinkChangeType;
import com.feed_the_beast.javacurselib.common.classes.ExternalCommunityPublicContract;
import com.feed_the_beast.javacurselib.service.contacts.contacts.GroupNotification;
import lombok.ToString;

@ToString
public class ExternalCommunityLinkChangedNotification extends BaseResponse implements Response {
    public ExternalCommunityLinkChangeType changeType;
    public GroupNotification group;
    public ExternalCommunityPublicContract community;
}
