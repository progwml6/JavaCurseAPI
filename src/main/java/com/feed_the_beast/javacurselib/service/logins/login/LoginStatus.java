package com.feed_the_beast.javacurselib.service.logins.login;

/**
 * representation of curse login api LoginStatus model
 */
public enum LoginStatus {

    SUCCESS(1), UNAUTHORIZED_LOGIN(3), INVALID_PASSWORD(4), UNKNOWN_USERNAME(5), UNKNOWN_EMAIL(6), CORRUPT_LIBRARY(102), SUBSCRIPTION_MISMATCH(104), SUBSCRIPTION_EXPIRED(105), MISSING_GRANT(
            108), GENERAL_ERROR(1000);
    private int value;

    LoginStatus (int value) {
        this.value = value;
    }

    public int getValue () {
        return value;
    }

}
