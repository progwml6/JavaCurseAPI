package com.feed_the_beast.javacurselib.websocket.messages.notifications.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

public enum ExternalAccountChangeType implements BetterEnum<Integer> {
    NEEDSRELINK(0), PARTNERED(1);

    private int value;

    ExternalAccountChangeType(int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue() {
        return value;
    }
}
