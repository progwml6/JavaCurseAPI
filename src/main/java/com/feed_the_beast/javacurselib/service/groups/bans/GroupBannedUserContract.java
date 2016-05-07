package com.feed_the_beast.javacurselib.service.groups.bans;

import com.feed_the_beast.javacurselib.CurseGUID;

/**
 * representation of curse groups/bans api GroupBannedUserContract model
 */
public class GroupBannedUserContract {
    public CurseGUID groupID;
    public String groupTitle;
    public int userID;
    public String userName;
    public int requestorUserID;
    public String requestorUsername;
    public long statusTimestamp;
    public String reason;
    public boolean isBanned;
}
