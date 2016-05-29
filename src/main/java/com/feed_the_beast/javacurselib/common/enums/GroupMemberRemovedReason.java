package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

public enum GroupMemberRemovedReason implements BetterEnum<Integer> {
    LEFT(0), KICKED (1), BANNED(2);
    private int value;

    GroupMemberRemovedReason(int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
