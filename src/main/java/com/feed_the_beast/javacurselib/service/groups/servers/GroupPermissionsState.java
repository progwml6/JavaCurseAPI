package com.feed_the_beast.javacurselib.service.groups.servers;

/**
 * Created by progwml6 on 5/22/16.
 */
public enum GroupPermissionsState {
    ALLOWED(0), ALLOWED_INHERITED(1), NOT_ALLOWED(2), NOT_ALLOWED_INHERITED(3);

    private int value;

    GroupPermissionsState (int value) {
        this.value = value;
    }

    public int getValue () {
        return value;
    }

}
