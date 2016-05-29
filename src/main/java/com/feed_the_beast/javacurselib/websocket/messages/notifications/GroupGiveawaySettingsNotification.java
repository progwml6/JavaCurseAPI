package com.feed_the_beast.javacurselib.websocket.messages.notifications;

import com.feed_the_beast.javacurselib.common.classes.GroupMemberContract;

// TODO: complete
public class GroupGiveawaySettingsNotification extends BaseResponse implements Response {
    public String groupID;
    public long[] requiredRoles;
    //public { [key: number]: number } roleBonuses;
    public long[] responseWindowSeconds;
    public long sharingBonus;
    public GroupMemberContract[] ignoredMembers;
    public boolean autoEnterActiveUsers;
    public long[] autoEnterRoles;
    public long[] autoClaimRoles;
    public long rollsBeforeWinner;
    public boolean allowRepeatWinners;
}
