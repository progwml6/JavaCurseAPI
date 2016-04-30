package com.feed_the_beast.javacurselib.websocket.messages.requests;

import com.feed_the_beast.javacurselib.websocket.messages.ResponseParser;

import javax.websocket.Session;
import java.io.IOException;

public abstract class BaseRequest implements Request {
    @Override
    public String toJsonString() {
        return ResponseParser.GSON.toJson(this, Request.class);
    }

    @Override
    public void execute(Session session) {
        try {
            session.getBasicRemote().sendText(toJsonString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}