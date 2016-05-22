package com.feed_the_beast.javacurselib.common.enums;

/**
 * representation of curse contact api GroupStatus
 */
public enum GroupStatus {
    NORMAL(0), DELETED(1);
    private int value;

    GroupStatus (int value) {
        this.value = value;
    }

    public int getValue () {
        return value;
    }

}
