package com.feed_the_beast.javacurselib.service.contacts.contacts;

/**
 * representation of curse contact api NotificationPreference
 */
public enum NotificationPreference {
    ENABLED(0), DISABLED(1), FILTERED(2);
    private int value;

    NotificationPreference (int numVal) {
        this.value = value;
    }

    public int getValue () {
        return value;
    }

}
