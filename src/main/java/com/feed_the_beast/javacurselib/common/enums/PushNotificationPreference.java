package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

/**
 * representation of curse sessions api UserConnectionStatus model
 */
public enum PushNotificationPreference implements BetterEnum<Integer> {
    ALL(0), FAVORITES(1), NONE(2);

    private int value;

    PushNotificationPreference (int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
