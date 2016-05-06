package com.feed_the_beast.javacurselib.service.contacts.users;

/**
 * representation of curse contact api FriendHintVerification model
 */
public enum FriendHintVerification {
    UNKNOWN(0), MANUAL_ENTRY(1), CLIENT_SUBMITTED(100), CLIENT_OBSERVED(200), VERIFIED(300);
    private int value;

    FriendHintVerification (int value) {
        this.value = value;
    }

    public int getValue () {
        return value;
    }

}
