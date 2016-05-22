package com.feed_the_beast.javacurselib.common.enums;

public enum GroupMemberRemovedReason {
    LEFT(0), KICKED (1), BANNED(2);
    private int value;

    GroupMemberRemovedReason(int value) {
        this.value = value;
    }

    public int getValue () {
        return value;
    }

}
