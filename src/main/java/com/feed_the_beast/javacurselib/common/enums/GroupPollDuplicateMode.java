package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

public enum GroupPollDuplicateMode implements BetterEnum<Integer> {
    LEGACY(0), PREVENTBYUSERID(1), PREVENTBYIP(2),
    PREVENTBYCOOKIE(3), ALLOWDUPLICATES(4);

    private int value;

    GroupPollDuplicateMode(int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
