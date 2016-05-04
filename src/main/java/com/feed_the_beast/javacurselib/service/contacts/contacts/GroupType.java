package com.feed_the_beast.javacurselib.service.contacts.contacts;

/**
 * representation of curse contact api GroupType
 */
public enum GroupType {
    NORMAL(0), LARGE(1), TEMPORARY(2);
    private int value;

    GroupType (int numVal) {
        this.value = value;
    }

    public int getValue () {
        return value;
    }

}