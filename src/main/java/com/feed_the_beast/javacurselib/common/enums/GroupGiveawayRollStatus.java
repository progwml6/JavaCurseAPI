package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

public enum GroupGiveawayRollStatus implements BetterEnum<Integer> {
    PENDING(0), INVALID(1), CLAIMED(2),
    CLAIMEXPIRED(3), FAKE(4);

    private int value;

    GroupGiveawayRollStatus(int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
