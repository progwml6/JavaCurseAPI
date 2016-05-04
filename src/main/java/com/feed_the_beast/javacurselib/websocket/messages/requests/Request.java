package com.feed_the_beast.javacurselib.websocket.messages.requests;

import com.feed_the_beast.javacurselib.websocket.NotificationsServiceContractType;

import javax.websocket.Session;

public interface Request {
    String toJsonString();
    void execute(Session session);
    NotificationsServiceContractType getTypeID();
}