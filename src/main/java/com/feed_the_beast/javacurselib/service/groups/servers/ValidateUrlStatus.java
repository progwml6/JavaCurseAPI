package com.feed_the_beast.javacurselib.service.groups.servers;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

public enum ValidateUrlStatus implements BetterEnum<Integer> {

    INVALID(0), TAKEN(1), AVAILABLE(2);

    private int value;

    ValidateUrlStatus (int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}