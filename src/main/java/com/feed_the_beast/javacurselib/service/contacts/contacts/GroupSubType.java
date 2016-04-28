package com.feed_the_beast.javacurselib.service.contacts.contacts;

/**
 * representation of curse contact api GroupSubType
 */
public enum GroupSubType {
    CUSTOM(0), GUILD(1), STREAM(2);
    private int value;

    GroupSubType (int numVal) {
        this.value = value;
    }

    public int getValue () {
        return value;
    }

}
