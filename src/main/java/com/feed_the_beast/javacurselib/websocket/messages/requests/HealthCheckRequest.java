package com.feed_the_beast.javacurselib.websocket.messages.requests;

public class HealthCheckRequest extends BaseRequest implements Request {
    public transient int TypeID = -1422086075;
    public String ApiKey;
    public String MachineName;

    @Override
    public int getTypeID() {
        return TypeID;
    }
}
