package com.feed_the_beast.javacurselib.service.groups.servers;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

public enum GroupSearchTag implements BetterEnum<Integer> {

    CASUAL(0), HARDCORE(1), COMPETITIVE(2), LFM(3), TWITCH(4), YOUTUBE(5), GUILD(6), AZUBU(7);

    private int value;

    GroupSearchTag (int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
