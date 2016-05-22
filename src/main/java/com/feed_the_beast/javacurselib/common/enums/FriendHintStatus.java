package com.feed_the_beast.javacurselib.common.enums;

/**
 * representation of curse contact api FriendHintStatus model
 */
public enum FriendHintStatus {
    NORMAL(0), DELETED(1);
    private int value;

    FriendHintStatus (int value) {
        this.value = value;
    }

    public int getValue () {
        return value;
    }

}
