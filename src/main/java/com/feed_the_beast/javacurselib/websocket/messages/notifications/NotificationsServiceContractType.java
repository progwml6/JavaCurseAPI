package com.feed_the_beast.javacurselib.websocket.messages.notifications;

import javax.annotation.Nonnull;

/*
 * Enable classes after implementation
 */
public enum NotificationsServiceContractType {
    HANDSHAKE(-476754606, HandshakeResponse.class),
    //CALL_NOTIFICATION(-1669214322, ),
    //CALL_RESPONDED_NOTIFICATION(-1145188782, ),
    CONVERSATION_MESSAGE_NOTIFICATION(-635182161, ConversationMessageNotification.class),
    //CONVERSATION_MESSAGE_RESPONSE(705131365, ),
    CONVERSATION_READ_NOTIFICATION(-695526586, ConversationReadNotification.class),
    //EXTERNAL_COMMUNITY_LINK_CHANGED_NOTIFICATION(738704822, ),
    //FRIENDSHIP_CHANGE_NOTIFICATION(580569888, ),
    //FRIENDSHIP_REMOVED_NOTIFICATION(1216900677, ),
    //FRIEND_SUGGESTION_NOTIFICATION(-1001397130, ),
    //GROUP_CHANGE_NOTIFICATION(149631008, ),
    //GROUP_GIVEAWAY_CHANGED_NOTIFICATION(1519023790, ),
    //GROUP_GIVEAWAY_SETTINGS_NOTIFICATION(-1318725298, ),
    //GROUP_INVITATION_NOTIFICATION(-1732183626, ),
    //GROUP_POLL_CHANGED_NOTIFICATION(-1942550100, ),
    //GROUP_POLL_SETTINGS_NOTIFICATION(-34150280, ),
    //GROUP_PREFERENCE_NOTIFICATION(72981382, ),
    JOIN_RESPONSE(-815187584, JoinResponse.class),
    //USER_CHANGE_NOTIFICATION(937250613, ),
    //USER_CLIENT_SETTINGS_NOTIFICATION(-1641871686, ),
    // Fallback
    UNKNOWN(Integer.MIN_VALUE, UnknownResponse.class);
    private int value;
    private Class<? extends Response> clazz;

    NotificationsServiceContractType(int numVal, @Nonnull Class<? extends Response> clazz) {
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

    public static NotificationsServiceContractType getEnumForClazz (@Nonnull Class<? extends Response> clazz) {
        for (NotificationsServiceContractType m : NotificationsServiceContractType.values()) {
            if (m.getClazz() == clazz) {
                return m;
            }
        }
        return UNKNOWN;
    }
}
