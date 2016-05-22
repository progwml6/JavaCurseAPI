package com.feed_the_beast.javacurselib.common.enums;

/**
 * representation of curse contact api GroupType
 */
public enum GroupType {
    NORMAL(0), LARGE(1), TEMPORARY(2);
    private int value;

    GroupType (int value) {
        this.value = value;
    }

    public int getValue () {
        return value;
    }

}
