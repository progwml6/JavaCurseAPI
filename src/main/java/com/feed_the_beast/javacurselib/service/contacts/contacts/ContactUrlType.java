package com.feed_the_beast.javacurselib.service.contacts.contacts;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

/**
 * representation of curse contact api ContactUrlType
 */
public enum ContactUrlType implements BetterEnum<Integer> {
    GROUP(0), SERVER(1), FRIEND(2);

    private int value;

    ContactUrlType (int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
