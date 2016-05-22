package com.feed_the_beast.javacurselib.common.enums;

/**
 * representation of curse contact api FriendshipStatus model
 */
public enum FriendshipStatus {
    AWAITING_ME(0), AWAITING_THEM(1), CONFIRMED(2), DECLINED_BY_ME(3), DECLINED_BY_THEM(4), REMOVING(5), DELETED(6);

    private int value;

    FriendshipStatus (int value) {
        this.value = value;
    }

    public int getValue () {
        return value;
    }

}
