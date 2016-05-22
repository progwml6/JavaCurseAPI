package com.feed_the_beast.javacurselib.common.enums;

/**
 * representation of curse contact api FriendPlatform model
 */
public enum FriendPlatform {
    UNKNOWN(0), BATTLE_NET(1), STEAM(2), FACEBOOK(3), SKYPE(4);
    private int value;

    FriendPlatform (int value) {
        this.value = value;
    }

    public int getValue () {
        return value;
    }

}
