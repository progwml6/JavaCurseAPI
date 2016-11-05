package com.feed_the_beast.javacurselib.addondumps;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

public enum ReleaseType implements BetterEnum<Integer> {

    RELEASE(1), BETA(2), ALPHA(3);
    private int value;

    ReleaseType (int value) {
        this.value = value;
    }

    @Override
    @Nonnull
    public Integer getValue () {
        return value;
    }

}
