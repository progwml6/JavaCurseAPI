package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

public enum GroupChangeType implements BetterEnum<Integer> {
    UNKNOWN(0), CREATEGROUP(1), ADDUSERS(2),
    REMOVEUSERS(3), UPDATEUSERS(4), CHANGEINFO(5),
    VOICESESSIONSTARTED(6), VOICESESSIONENDED(7), VOICESESSIONUSERJOINED(8),
    VOICESESSIONUSERLEFT(9), REMOVEGROUP(10), GROUPREORGANIZED(11),
    PERMISSIONSCHANGED(12), ROLENAMESCHANGED(13), UPDATEEMOTICONS(14);

    private int value;

    GroupChangeType(int value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Integer getValue () {
        return value;
    }
}
