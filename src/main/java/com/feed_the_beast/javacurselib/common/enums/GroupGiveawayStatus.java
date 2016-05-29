package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

public enum GroupGiveawayStatus implements BetterEnum<Integer> {
    ACTIVE(0), ROLLING(1), WAITINGFORCLAIM(2),
    CLAIMED(3), ENDED(4), INACTIVE(5);

    private int value;

    GroupGiveawayStatus(int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
