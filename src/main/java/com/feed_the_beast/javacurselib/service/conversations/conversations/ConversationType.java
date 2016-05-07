package com.feed_the_beast.javacurselib.service.conversations.conversations;

public enum ConversationType {
    FRIENDSHIP(0), GROUP(1), ADHOC(2),GROUP_PRIVATE_CONVERSATION(3);
    private int value;

    ConversationType (int value) {
        this.value = value;
    }

    public int getValue () {
        return value;
    }

}
