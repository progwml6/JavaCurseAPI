package com.feed_the_beast.javacurselib.websocket.messages.requests;

public class HealthCheckRequest extends BaseRequest implements Request {
    public transient int typeID = -1422086075;
    public String apiKey;
    public String machineName;

    @Override
    public int getTypeID() {
        return typeID;
    }
}
