package com.feed_the_beast.javacurselib.service.groups.groups;

// TODO: Optionals? How does Gson handle Optionals?
public class GroupMemberSearchRequest {
    public String username; // TODO: not present when search all members
    public int roleID;  // TODO: not present when search all members
    public int pageSize; // TODO: MAX=100?
    public int page;
    public GroupMemberSearchSortType sortType;
    public boolean sortAscending; // TODO: not present when search all members
}
