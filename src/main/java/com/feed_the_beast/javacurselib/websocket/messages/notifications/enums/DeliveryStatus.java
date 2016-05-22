package com.feed_the_beast.javacurselib.websocket.messages.notifications.enums;

/**
 * Created by jikuja on 23.5.2016.
 */
public enum DeliveryStatus {
    UNKNOWNUSER(0), ERROR(1), FORBIDDEN(2),
    FRIENDOFFLINE(3), SUCCESSFUL(4), THROTTLED(5);

    private int value;

    DeliveryStatus(int value) {
        this.value = value;
    }

    public int getValue () {
        return value;
    }
}
