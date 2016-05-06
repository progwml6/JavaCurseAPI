package com.feed_the_beast.javacurselib.service.contacts.contacts;

/**
 * representation of curse contact api GroupStatus
 */
public enum GroupStatus {
    NORMAL(0), DELETED(1);
    private int value;

    GroupStatus (int value) {
        this.value = value;
    }

    public int getValue () {
        return value;
    }

}
