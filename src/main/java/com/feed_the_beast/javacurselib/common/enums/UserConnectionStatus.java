package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

/**
 * representation of curse contact api UserConnectionStatus model
 */
public enum UserConnectionStatus implements BetterEnum<Integer> {
    OFFLINE(0), ONLINE(1), AWAY(2), INVISIBLE(3), IDLE(4), DO_NOT_DISTURB(5);

    private int value;

    UserConnectionStatus (int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
