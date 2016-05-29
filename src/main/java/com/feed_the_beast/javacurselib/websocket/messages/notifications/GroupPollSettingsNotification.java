package com.feed_the_beast.javacurselib.websocket.messages.notifications;

import com.feed_the_beast.javacurselib.common.enums.GroupPollDisplayType;
import com.feed_the_beast.javacurselib.common.enums.GroupPollDuplicateMode;

public class GroupPollSettingsNotification extends BaseResponse implements Response {
    public String groupID;
    public boolean allowMultipleSelections;
    public GroupPollDisplayType displayType;
    public long[] requiredRoles;
    public boolean isPublic;
    public boolean allowRevotes;
    public GroupPollDuplicateMode duplicateMode;
}
