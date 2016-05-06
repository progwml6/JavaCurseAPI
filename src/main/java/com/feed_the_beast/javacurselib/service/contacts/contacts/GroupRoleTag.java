package com.feed_the_beast.javacurselib.service.contacts.contacts;

/**
 * representation of curse contact api GroupRoleTag
 */
public enum GroupRoleTag {
    NONE(0), SYNCED_FOLLOWER(1), SYNCED_SUBSCRIBER(2), SYNCED_MODDER(3), SYNCED_OWNER(4);

    private int value;

    GroupRoleTag (int value) {
        this.value = value;
    }

    public int getValue () {
        return value;
    }

}
