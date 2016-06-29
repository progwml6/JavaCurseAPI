package com.feed_the_beast.javacurselib.service.groups.groups;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

public enum GroupMemberSearchSortType implements BetterEnum<Integer> {
    DEFAULT(0), ROLE(1), USERNAME(2), DATE_JOINED(3), DATE_LAST_ACTIVE(4);

    private int value;

    GroupMemberSearchSortType(int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue() {
        return value;
    }
}
