package com.feed_the_beast.javacurselib.service.contacts.contacts;

/**
 * representation of curse contact api AccountType
 */
//TODO harden this for when new types are added
public enum AccountType {
    CURSE(0), TWITCH(1), YOUTUBE(2);
    private int value;

    AccountType (int numVal) {
        this.value = value;
    }

    public int getValue () {
        return value;
    }

}
