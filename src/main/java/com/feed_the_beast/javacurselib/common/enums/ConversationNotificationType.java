package com.feed_the_beast.javacurselib.common.enums;

public enum ConversationNotificationType {
    NORMAL(0), EDITED(1), LIKED(2), DELETED(3);
    private int value;

    ConversationNotificationType (int value) {
        this.value = value;
    }

    public int getValue () {
        return value;
    }

}
