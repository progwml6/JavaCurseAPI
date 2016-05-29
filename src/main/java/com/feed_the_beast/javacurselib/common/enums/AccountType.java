package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

/**
 * representation of curse contact api AccountType
 */
//TODO harden this for when new types are added
public enum AccountType implements BetterEnum<Integer> {
    CURSE(0), TWITCH(1), YOUTUBE(2);

    private int value;

    AccountType (int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
