package com.feed_the_beast.javacurselib.common.enums;

/**
 * representation of curse contact api UserConnectionStatus model
 */
public enum UserConnectionStatus {
    OFFLINE(0), ONLINE(1), AWAY(2), INVISIBLE(3), IDLE(4), DO_NOT_DISTURB(5);

    private int value;

    UserConnectionStatus (int value) {
        this.value = value;
    }

    public int getValue () {
        return value;
    }

}
