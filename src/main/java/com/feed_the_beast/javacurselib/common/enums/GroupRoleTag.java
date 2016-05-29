package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

/**
 * representation of curse contact api GroupRoleTag
 */
public enum GroupRoleTag implements BetterEnum<Integer> {
    NONE(0), SYNCED_FOLLOWER(1), SYNCED_SUBSCRIBER(2), SYNCED_MODDER(3), SYNCED_OWNER(4);

    private int value;

    GroupRoleTag (int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
