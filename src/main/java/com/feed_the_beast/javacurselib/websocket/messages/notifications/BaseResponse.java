package com.feed_the_beast.javacurselib.websocket.messages.notifications;

import com.feed_the_beast.javacurselib.websocket.JsonFactory;

import javax.annotation.Nonnull;

public abstract class BaseResponse implements Response {
    transient NotificationsServiceContractType typeID;
    transient String origMessage;

    @Override
    public String toJsonString() {
        return JsonFactory.GSON.toJson(this, Response.class);
    }

    @Override
    public String getOrigMessage() {
        return origMessage;
    }

    @Override
    public void setOrigMessage(@Nonnull String s) {
        origMessage = s;
    }

    @Override
    public NotificationsServiceContractType getTypeID() {
        return typeID;
    }

    @Override
    public void setTypeID(@Nonnull NotificationsServiceContractType t) {
        typeID = t;
    }

    // TODO: add generic POJO toString
}