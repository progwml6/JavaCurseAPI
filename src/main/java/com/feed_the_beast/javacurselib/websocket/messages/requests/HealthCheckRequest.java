package com.feed_the_beast.javacurselib.websocket.messages.requests;

import lombok.ToString;

// TODO: what is this?
@ToString
public class HealthCheckRequest extends BaseRequest implements Request {
    public String apiKey;
    public String machineName;

    @Override
    public RequestsServiceContractType getTypeID() {
        return RequestsServiceContractType.HEALTH_CHECK_REQUEST;
    }
}
