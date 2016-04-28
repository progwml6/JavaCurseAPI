package com.feed_the_beast.javacurselib.service.contacts.contacts;

/**
 * representation of curse contact api GroupMode
 */
public enum GroupMode {
    TEXT_AND_VOICE(0), TEXT_ONLY(1);

    private int value;

    GroupMode (int numVal) {
        this.value = value;
    }

    public int getValue () {
        return value;
    }

}
