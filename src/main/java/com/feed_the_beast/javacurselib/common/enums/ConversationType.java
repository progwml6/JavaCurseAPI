package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

public enum ConversationType implements BetterEnum<Integer> {
    FRIENDSHIP(0), GROUP(1), ADHOC(2),GROUP_PRIVATE_CONVERSATION(3);

    private int value;

    ConversationType (int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
