package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

/**
 * representation of curse contact api GroupType
 */
public enum GroupType implements BetterEnum<Integer> {
    NORMAL(0), LARGE(1), TEMPORARY(2);

    private int value;

    GroupType (int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
