package com.feed_the_beast.javacurselib.websocket.messages.notifications.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

public enum DeliveryStatus implements BetterEnum<Integer> {
    UNKNOWNUSER(0), ERROR(1), FORBIDDEN(2),
    FRIENDOFFLINE(3), SUCCESSFUL(4), THROTTLED(5);

    private int value;

    DeliveryStatus(int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
