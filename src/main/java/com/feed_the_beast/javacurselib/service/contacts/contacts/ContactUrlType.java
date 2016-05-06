package com.feed_the_beast.javacurselib.service.contacts.contacts;

/**
 * representation of curse contact api ContactUrlType
 */
public enum ContactUrlType {
    GROUP(0), SERVER(1), FRIEND(2);

    private int value;

    ContactUrlType (int value) {
        this.value = value;
    }

    public int getValue () {
        return value;
    }

}
