package com.feed_the_beast.javacurselib.websocket.messages.requests;

public enum RequestsServiceContractType {
    CONVERSATION_MARK_READ_REQUEST(-342895375, ConversationMarkReadRequest.class),
    CONVERSATION_MESSAGE_REQUEST(-2124552136, ConversationMessageRequest.class),
    HEALTH_CHECK_REQUEST(-1422086075, HealthCheckRequest.class),
    JOIN_REQUEST(-2101997347, JoinRequest.class),
    HANDSHAKE(-476754606, HandshakeRequest.class);

    private int value;
    private Class<? extends Request> clazz;

    RequestsServiceContractType(int numVal, Class clazz) {
        this.value = numVal;
        this.clazz = clazz;
    }

    public int getValue () {
        return value;
    }

    public Class<? extends Request> getClazz() {
        return clazz;
    }

    public static RequestsServiceContractType getEnumForValue (int val) {
        for (RequestsServiceContractType m : RequestsServiceContractType.values()) {
            if (m.getValue() == val) {
                return m;
            }
        }
        throw new RuntimeException("API error");
    }

    public static RequestsServiceContractType getEnumForClazz (Class<? extends Request> clazz) {
        for (RequestsServiceContractType m : RequestsServiceContractType.values()) {
            if (m.getClazz() == clazz) {
                return m;
            }
        }
        throw new RuntimeException("API error");
    }

}
