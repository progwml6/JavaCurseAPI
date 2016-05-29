package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

/**
 * representation of curse contact api FriendshipStatus model
 */
public enum FriendshipStatus implements BetterEnum<Integer> {
    AWAITING_ME(0), AWAITING_THEM(1), CONFIRMED(2),
    DECLINED_BY_ME(3), DECLINED_BY_THEM(4), REMOVING(5),
    DELETED(6);

    private int value;

    FriendshipStatus (int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
