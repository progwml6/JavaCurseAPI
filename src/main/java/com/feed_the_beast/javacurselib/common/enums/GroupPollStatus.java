package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

public enum GroupPollStatus implements BetterEnum<Integer> {
    STARTING(0), RUNNING(1),
    ENDED(2), INACTIVE(3);

    private int value;

    GroupPollStatus(int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
