package com.feed_the_beast.javacurselib.websocket.messages.notifications.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

public enum JoinStatus implements BetterEnum<Integer> {
    SUCCESSFUL(1), FAILEDUNHANDLEDEXCEPTION(2), INVALIDCLIENTVERSION(3),
    INVALIDSESSIONID(4), TIMEOUT(5), THROTTLED(6);

    private int value;

    JoinStatus(int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
