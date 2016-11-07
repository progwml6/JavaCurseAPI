package com.feed_the_beast.javacurselib.service.groups.bans;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

public enum BanUserMessageDeleteMode implements BetterEnum<Integer> {
    NONE(0), LAST_DAY(1), LAST_WEEK(2), ALL(3);
    private int value;

    BanUserMessageDeleteMode (int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
