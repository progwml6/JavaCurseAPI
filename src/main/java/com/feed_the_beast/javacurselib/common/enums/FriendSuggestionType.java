package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

public enum FriendSuggestionType implements BetterEnum<Integer> {
    MUTUALFRIEND(0), GAMEFRIEND(1), PLATFORMFRIEND(2);

    private int value;

    FriendSuggestionType(int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
