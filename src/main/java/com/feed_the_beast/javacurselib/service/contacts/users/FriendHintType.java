package com.feed_the_beast.javacurselib.service.contacts.users;

/**
 * representation of curse contact api FriendHintType
 */
public enum FriendHintType {
    UNKNOWN(0), CENTRAL_ID(1), USERNAME(2), EMAIL(3), SITE(4), GAME(5), PLATFORM(6);
    private int value;

    FriendHintType (int numVal) {
        this.value = value;
    }

    public int getValue () {
        return value;
    }

}
