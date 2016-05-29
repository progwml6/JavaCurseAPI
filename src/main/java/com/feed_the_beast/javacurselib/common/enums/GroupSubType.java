package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

/**
 * representation of curse contact api GroupSubType
 */
public enum GroupSubType implements BetterEnum<Integer> {
    CUSTOM(0), GUILD(1), STREAM(2);

    private int value;

    GroupSubType (int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
