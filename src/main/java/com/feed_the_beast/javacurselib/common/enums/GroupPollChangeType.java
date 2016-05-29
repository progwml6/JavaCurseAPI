package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

public enum GroupPollChangeType implements BetterEnum<Integer> {
    STARTED(0), ENDED(1),
    VOTESUPDATED(2), DEACTIVATED(3);

    private int value;

    GroupPollChangeType(int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
