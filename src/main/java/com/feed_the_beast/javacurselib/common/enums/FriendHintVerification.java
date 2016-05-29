package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

/**
 * representation of curse contact api FriendHintVerification model
 */
public enum FriendHintVerification implements BetterEnum<Integer> {
    UNKNOWN(0), MANUAL_ENTRY(1), CLIENT_SUBMITTED(100), CLIENT_OBSERVED(200), VERIFIED(300);
    private int value;

    FriendHintVerification (int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
