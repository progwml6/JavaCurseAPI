package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

/**
 * representation of curse sessions api DevicePlatform
 */
public enum DevicePlatform implements BetterEnum<Integer> {
    WINDOWS(0), MAC(1), IOS(2), ANDROID(3), WINDOWS_PHONE(4), BLACKBERRY(5), CHROME(6), UNKNOWN (7), TWITCH(8);

    private int value;

    DevicePlatform (int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
