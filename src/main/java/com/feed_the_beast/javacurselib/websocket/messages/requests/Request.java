package com.feed_the_beast.javacurselib.websocket.messages.requests;

import javax.websocket.Session;

public interface Request {
    String toJsonString();
    void execute(Session session);
    int getTypeID();
}