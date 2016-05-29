package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

/**
 * representation of curse contact api FriendHintStatus model
 */
public enum FriendHintStatus implements BetterEnum<Integer> {
    NORMAL(0), DELETED(1);
    private int value;

    FriendHintStatus (int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
