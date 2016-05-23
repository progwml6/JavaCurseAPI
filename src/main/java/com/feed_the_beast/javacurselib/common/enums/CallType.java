package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

public enum CallType implements BetterEnum<Integer> {
    ADHOC(1), AUTOMATCH(2), FRIEND(3),
    GROUP(4), MULTIFRIEND(5);

    private int value;

    CallType(int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
