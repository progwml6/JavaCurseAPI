package com.feed_the_beast.javacurselib.common.enums;

/**
 * representation of curse contact api GroupMode
 */
public enum GroupMode {
    TEXT_AND_VOICE(0), TEXT_ONLY(1);

    private int value;

    GroupMode (int value) {
        this.value = value;
    }

    public int getValue () {
        return value;
    }

}
