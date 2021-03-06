package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

/**
 * representation of curse contact api FriendHintType
 */
public enum FriendHintType implements BetterEnum<Integer> {
    UNKNOWN(0), CENTRAL_ID(1), USERNAME(2), EMAIL(3), SITE(4), GAME(5), PLATFORM(6);
    private int value;

    FriendHintType (int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
