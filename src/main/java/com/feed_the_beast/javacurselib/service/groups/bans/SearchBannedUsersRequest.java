package com.feed_the_beast.javacurselib.service.groups.bans;

/**
 * representation of curse groups/bans api SearchBannedUsersRequest model
 */
public class SearchBannedUsersRequest {
    public int pageNumber;
    public int pageSize;
    public int query;
    public String username;
    public String requestorUsername;
    public String reason;
    public GroupBannedUserSortType sortType;
    public boolean sortAscending;
}
