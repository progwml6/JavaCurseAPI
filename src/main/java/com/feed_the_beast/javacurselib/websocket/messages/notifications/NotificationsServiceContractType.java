package com.feed_the_beast.javacurselib.websocket.messages.notifications;

/*
 * Enable classes after implementation
 */
public enum NotificationsServiceContractType {
    HANDSHAKE(-476754606, HandshakeResponse.class),
    //CALL_NOTIFICATION(-1669214322, UnknownResponse.class),
    //CALL_RESPONDED_NOTIFICATION(-1145188782, UnknownResponse.class),
    CONVERSATION_MESSAGE_NOTIFICATION(-635182161, ConversationMessageNotification.class),
    //CONVERSATION_MESSAGE_RESPONSE(705131365, UnknownResponse.class),
    //CONVERSATION_READ_NOTIFICATION(-695526586, UnknownResponse.class),
    //EXTERNAL_COMMUNITY_LINK_CHANGED_NOTIFICATION(738704822, UnknownResponse.class),
    //FRIENDSHIP_CHANGE_NOTIFICATION(580569888, UnknownResponse.class),
    //FRIENDSHIP_REMOVED_NOTIFICATION(1216900677, UnknownResponse.class),
    //FRIEND_SUGGESTION_NOTIFICATION(-1001397130, UnknownResponse.class),
    //GROUP_CHANGE_NOTIFICATION(149631008, UnknownResponse.class),
    //GROUP_GIVEAWAY_CHANGED_NOTIFICATION(1519023790, UnknownResponse.class),
    //GROUP_GIVEAWAY_SETTINGS_NOTIFICATION(-1318725298, UnknownResponse.class),
    //GROUP_INVITATION_NOTIFICATION(-1732183626, UnknownResponse.class),
    //GROUP_POLL_CHANGED_NOTIFICATION(-1942550100, UnknownResponse.class),
    //GROUP_POLL_SETTINGS_NOTIFICATION(-34150280, UnknownResponse.class),
    //GROUP_PREFERENCE_NOTIFICATION(72981382, UnknownResponse.class),
    JOIN_RESPONSE(-815187584, JoinResponse.class),
    //USER_CHANGE_NOTIFICATION(937250613, UnknownResponse.class),
    //USER_CLIENT_SETTINGS_NOTIFICATION(-1641871686, UnknownResponse.class),
    // Fallback
    UNKNOWN(Integer.MIN_VALUE, UnknownResponse.class);
    private int value;
    private Class<? extends Response> clazz;

    NotificationsServiceContractType(int numVal, Class<? extends Response> clazz) {
        this.value = numVal;
        this.clazz = clazz;
    }

    public int getValue () {
        return value;
    }

    public Class<? extends Response> getClazz() {
        return clazz;
    }

    public static NotificationsServiceContractType getEnumForValue (int val) {
        for (NotificationsServiceContractType m : NotificationsServiceContractType.values()) {
            if (m.getValue() == val) {
                return m;
            }
        }
        return UNKNOWN;
    }

    public static NotificationsServiceContractType getEnumForClazz (Class<? extends Response> clazz) {
        for (NotificationsServiceContractType m : NotificationsServiceContractType.values()) {
            if (m.getClazz() == clazz) {
                return m;
            }
        }
        return UNKNOWN;
    }
}
