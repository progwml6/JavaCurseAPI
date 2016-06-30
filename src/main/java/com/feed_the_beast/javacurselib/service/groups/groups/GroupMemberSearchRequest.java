package com.feed_the_beast.javacurselib.service.groups.groups;

import lombok.Data;

public class GroupMemberSearchRequest {
    public String username;                         //optional
    public Integer roleID;                          //optional
    public int pageSize = 100;
    public int page;
    public GroupMemberSearchSortType sortType;      //optional
    public boolean sortAscending;

    public GroupMemberSearchRequest() {
    }

    public GroupMemberSearchRequest(int page) {
        this.page = page;
    }
}
