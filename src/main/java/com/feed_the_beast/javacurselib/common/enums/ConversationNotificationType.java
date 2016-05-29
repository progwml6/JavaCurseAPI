package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

public enum ConversationNotificationType implements BetterEnum<Integer> {
    NORMAL(0), EDITED(1), LIKED(2), DELETED(3);
    private int value;

    ConversationNotificationType (int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
