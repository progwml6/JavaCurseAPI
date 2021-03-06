package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

/**
 * representation of curse contact api FriendHintVisibility model
 */
public enum FriendHintVisibility implements BetterEnum<Integer> {
    VISIBLE_TO_FRIENDS(0), VISIBLE_TO_EVERYONE(1), HIDDEN(2);
    private int value;

    FriendHintVisibility (int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
