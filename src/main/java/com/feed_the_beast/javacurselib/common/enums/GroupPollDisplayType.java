package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

public enum GroupPollDisplayType implements BetterEnum<Integer> {
    BARGRAPH(0), PIECHART(1);

    private int value;

    GroupPollDisplayType(int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
