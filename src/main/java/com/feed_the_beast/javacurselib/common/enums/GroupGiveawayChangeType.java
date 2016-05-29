package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

public enum GroupGiveawayChangeType implements BetterEnum<Integer> {
    UNKNOWN(0),STARTED(1), ENDED(2),
    REMOVED(3), PARTICIPANTADDED(4), PARTICIPANTREMOVED(5),
    WINNERSELECTED(6), INVALIDWINNERSELECTED(7), PRIZECLAIMED(8),
    CLAIMEXPIRED(9), ENTRIESUPDATED(10), INVALIDROLL(11),
    FAKEROLL(12), ROLLING(13);

    private int value;

    GroupGiveawayChangeType(int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
