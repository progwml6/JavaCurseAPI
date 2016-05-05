package com.feed_the_beast.javacurselib.websocket.messages.notifications;

import com.feed_the_beast.javacurselib.websocket.messages.ResponseParser;

public abstract class BaseResponse implements Response {
    transient NotificationsServiceContractType typeID;
    transient String origMessage;

    @Override
    public String toJsonString() {
        return ResponseParser.GSON.toJson(this, Response.class);
    }

    @Override
    public String getOrigMessage() {
        return origMessage;
    }

    @Override
    public void setOrigMessage(String s) {
        origMessage = s;
    }

    @Override
    public NotificationsServiceContractType getTypeID() {
        return typeID;
    }

    @Override
    public void setTypeID(NotificationsServiceContractType t) {
        typeID = t;
    }

    // TODO: add generic POJO toString
}