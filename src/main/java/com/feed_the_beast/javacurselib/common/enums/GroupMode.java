package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

/**
 * representation of curse contact api GroupMode
 */
public enum GroupMode implements BetterEnum<Integer> {
    TEXT_AND_VOICE(0), TEXT_ONLY(1);

    private int value;

    GroupMode (int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
