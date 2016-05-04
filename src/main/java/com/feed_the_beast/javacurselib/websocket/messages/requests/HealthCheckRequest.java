package com.feed_the_beast.javacurselib.websocket.messages.requests;

import com.feed_the_beast.javacurselib.websocket.NotificationsServiceContractType;

public class HealthCheckRequest extends BaseRequest implements Request {
    public transient NotificationsServiceContractType typeID = NotificationsServiceContractType.HEALTH_CHECK_REQUEST;
    public String apiKey;
    public String machineName;

    @Override
    public NotificationsServiceContractType getTypeID() {
        return typeID;
    }
}
