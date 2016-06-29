package com.feed_the_beast.javacurselib.service.groups.groups;

public class GroupMemberSearchRequest {
    public String username;
    public int roleID;
    public int pageSize;
    public int page;
    public GroupMemberSearchSortType sortType;
    public boolean sortAscending;
}
