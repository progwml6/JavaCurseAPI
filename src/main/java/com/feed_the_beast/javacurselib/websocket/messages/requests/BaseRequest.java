package com.feed_the_beast.javacurselib.websocket.messages.requests;

import com.feed_the_beast.javacurselib.websocket.JsonFactory;

import javax.annotation.Nonnull;
import javax.websocket.Session;
import java.io.IOException;

public abstract class BaseRequest implements Request {
    @Override
    public String toJsonString() {
        return JsonFactory.GSON.toJson(this, Request.class);
    }
}