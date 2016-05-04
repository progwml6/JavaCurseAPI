package com.feed_the_beast.javacurselib.websocket;

/**
 * enum for the various types of notifications that exist
 */
public enum NotificationsServiceContractType {
    CONVERSATION_MARK_READ_REQUEST(-342895375),
    CONVERSATION_MESSAGE_REQUEST(-2124552136),
    HEALTH_CHECK_REQUEST(-1422086075),
    JOIN_REQUEST(-2101997347),
    HANDSHAKE(-476754606),
    CALL_NOTIFICATION(-1669214322),
    CALL_RESPONDED_NOTIFICATION(-1145188782),
    CONVERSATION_MESSAGE_NOTIFICATION(-635182161),
    CONVERSATION_MESSAGE_RESPONSE(705131365),
    CONVERSATION_READ_NOTIFICATION(-695526586),
    EXTERNAL_COMMUNITY_LINK_CHANGED_NOTIFICATION(738704822),
    FRIENDSHIP_CHANGE_NOTIFICATION(580569888),
    FRIENDSHIP_REMOVED_NOTIFICATION(1216900677),
    FRIEND_SUGGESTION_NOTIFICATION(-1001397130),
    GROUP_CHANGE_NOTIFICATION(149631008),
    GROUP_GIVEAWAY_CHANGED_NOTIFICATION(1519023790),
    GROUP_GIVEAWAY_SETTINGS_NOTIFICATION(-1318725298),
    GROUP_INVITATION_NOTIFICATION(-1732183626),
    GROUP_POLL_CHANGED_NOTIFICATION(-1942550100),
    GROUP_POLL_SETTINGS_NOTIFICATION(-34150280),
    GROUP_PREFERENCE_NOTIFICATION(72981382),
    JOIN_RESPONSE(-815187584),
    USER_CHANGE_NOTIFICATION(937250613),
    USER_CLIENT_SETTINGS_NOTIFICATION(-1641871686),
    UNKOWN(666);//TODO should this stay? This doesn't exist at curse but is here to avoid null returns
    private int value;

    NotificationsServiceContractType (int numVal) {
        this.value = numVal;
    }

    public int getValue () {
        return value;
    }

    public NotificationsServiceContractType getEnumForValue (int val) {
        for (NotificationsServiceContractType m : NotificationsServiceContractType.values()) {
            if (m.getValue() == val) {
                return m;
            }
        }
        return UNKOWN;
    }
}
