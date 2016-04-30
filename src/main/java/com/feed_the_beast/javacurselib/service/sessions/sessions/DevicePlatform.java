package com.feed_the_beast.javacurselib.service.sessions.sessions;

/**
 * representation of curse sessions api DevicePlatform
 */
public enum DevicePlatform {
    WINDOWS(0), MAC(1), IOS(2), ANDROID(3), WINDOWS_PHONE(4), BLACKBERRY(5), CHROME(6), UNKNOWN (7);

    private int value;

    DevicePlatform (int numVal) {
        this.value = value;
    }

    public int getValue () {
        return value;
    }

}
