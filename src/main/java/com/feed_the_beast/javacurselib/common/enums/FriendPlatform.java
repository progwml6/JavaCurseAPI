package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

/**
 * representation of curse contact api FriendPlatform model
 */
public enum FriendPlatform implements BetterEnum<Integer> {
    UNKNOWN(0), BATTLE_NET(1), STEAM(2), FACEBOOK(3), SKYPE(4);
    private int value;

    FriendPlatform (int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
