package com.feed_the_beast.javacurselib.websocket.messages.requests;
// TODO: what is this?
public class HealthCheckRequest extends BaseRequest implements Request {
    public String apiKey;
    public String machineName;

    @Override
    public RequestsServiceContractType getTypeID() {
        return RequestsServiceContractType.HEALTH_CHECK_REQUEST;
    }
}
