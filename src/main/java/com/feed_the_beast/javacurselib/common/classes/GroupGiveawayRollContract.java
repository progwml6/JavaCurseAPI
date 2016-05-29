package com.feed_the_beast.javacurselib.common.classes;

import com.feed_the_beast.javacurselib.common.enums.GroupGiveawayRollStatus;

public class GroupGiveawayRollContract {
    public long userID;
    public String username;
    public long rollNumber;
    public GroupGiveawayRollStatus rollStatus;
    public long timestamp;
    public long bestRoleID;
    public long bestRoleName;
}
