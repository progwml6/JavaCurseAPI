package com.feed_the_beast.javacurselib.service.sessions.sessions;

/**
 * representation of curse sessions api UserConnectionStatus model
 */
public enum PushNotificationPreference {
    ALL(0), FAVORITES(1), NONE(2);
    private int value;

    PushNotificationPreference (int numVal) {
        this.value = value;
    }

    public int getValue () {
        return value;
    }

}
