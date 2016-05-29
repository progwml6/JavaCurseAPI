package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

/**
 * representation of curse groups/bans api GroupBannedUserSortType model
 */
public enum GroupBannedUserSortType implements BetterEnum<Integer> {
    USERNAME(0), DATE(1), REASON(2), REQUESTOR(3);
    private int value;

    GroupBannedUserSortType (int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
