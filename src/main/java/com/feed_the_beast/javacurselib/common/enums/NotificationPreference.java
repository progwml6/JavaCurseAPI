package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

/**
 * representation of curse contact api NotificationPreference
 */
public enum NotificationPreference implements BetterEnum<Integer> {
    ENABLED(0), DISABLED(1), FILTERED(2);

    private int value;

    NotificationPreference (int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
