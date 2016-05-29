package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

/**
 * representation of curse contact api GroupStatus
 */
public enum GroupStatus implements BetterEnum<Integer> {
    NORMAL(0), DELETED(1);

    private int value;

    GroupStatus (int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
