package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

public enum ExternalCommunityLinkChangeType implements BetterEnum<Integer> {
    LINKED(0), UNLINKED(1), LIVESTATUS(2);

    int value;

    ExternalCommunityLinkChangeType(int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue() {
        return value;
    }
}
