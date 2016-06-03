package com.feed_the_beast.javacurselib.common.classes;

import com.feed_the_beast.javacurselib.common.enums.GroupGiveawayStatus;
// TODO: complete
public class GroupGiveawayNotification {
    public String groupID;
    public long giveawayID;
    public String title;
    public long creatorID;
    public long[] requiredRoles;
    //public { [key: number]: number } roleBonuses;
    public long responseWindowSeconds;
    public long sharingBonus;
    public boolean allowRepeatWinners;
    public boolean autoEnterActiveUsers;
    public long  rollsBeforeWinner;
    public long[] autoClaimRoles;
    public long[] autoEnterRoles;
    public long[] ignoredUsers;
    public long entries;
    public long fakeRollsLeft;
    //public { [key: number]: number } topShares;
    public GroupGiveawayStatus status;
    public long currentRollNumber;
}
