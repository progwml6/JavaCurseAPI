package com.feed_the_beast.javacurselib.service.logins.register;

/**
 * representation of curse register api RegisterStatus
 */
public enum RegisterStatus {
    SUCCESS(0), EMAIL_IN_USE(1), USERNAME_IN_USE(2), INVALID_EMAIL(3), INVALID_PROFILE(4), INVALID_USERNAME(5), INVALID_PASSWORD(6), GENERAL_ERROR(7), TOO_MANY_ACCOUNTS_SAME_IP(8);

    private int value;

    RegisterStatus (int value) {
        this.value = value;
    }

    public int getValue () {
        return value;
    }
}
