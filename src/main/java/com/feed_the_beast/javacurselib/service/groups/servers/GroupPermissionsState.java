package com.feed_the_beast.javacurselib.service.groups.servers;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

public enum GroupPermissionsState implements BetterEnum<Integer> {
    ALLOWED(0), ALLOWED_INHERITED(1), NOT_ALLOWED(2), NOT_ALLOWED_INHERITED(3);

    private int value;

    GroupPermissionsState (int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
