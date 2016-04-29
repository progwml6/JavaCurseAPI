package com.feed_the_beast.javacurselib.service.contacts.users;

/**
 * representation of curse contact api FriendHintStatus model
 */
public enum FriendHintStatus {
    NORMAL(0), DELETED(1);
    private int value;

    FriendHintStatus (int numVal) {
        this.value = value;
    }

    public int getValue () {
        return value;
    }

}
