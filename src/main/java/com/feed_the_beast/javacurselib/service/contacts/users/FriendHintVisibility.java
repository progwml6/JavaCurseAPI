package com.feed_the_beast.javacurselib.service.contacts.users;

/**
 * representation of curse contact api FriendHintVisibility model
 */
public enum FriendHintVisibility {
    VISIBLE_TO_FRIENDS(0), VISIBLE_TO_EVERYONE(1), HIDDEN(2);
    private int value;

    FriendHintVisibility (int value) {
        this.value = value;
    }

    public int getValue () {
        return value;
    }

}
