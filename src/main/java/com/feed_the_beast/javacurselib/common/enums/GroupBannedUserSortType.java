package com.feed_the_beast.javacurselib.common.enums;

/**
 * representation of curse groups/bans api GroupBannedUserSortType model
 */
public enum GroupBannedUserSortType {
    USERNAME(0), DATE(1), REASON(2), REQUESTOR(3);
    private int value;

    GroupBannedUserSortType (int value) {
        this.value = value;
    }

    public int getValue () {
        return value;
    }

}
