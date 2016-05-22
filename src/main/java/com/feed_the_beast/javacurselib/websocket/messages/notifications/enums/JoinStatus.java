package com.feed_the_beast.javacurselib.websocket.messages.notifications.enums;

public enum JoinStatus {
    IGNORED(0),     // TODO: why I had to add this?
    SUCCESSFUL(1),
    FAILEDUNHANDLEDEXCEPTION(2),
    INVALIDCLIENTVERSION(3),
    INVALIDSESSIONID(4),
    TIMEOUT(5),
    THROTTLED(6);

    private int value;

    JoinStatus(int value) {
        this.value = value;
    }

    public int getValue () {
        return value;
    }
}
