package com.feed_the_beast.javacurselib.websocket.messages.requests;

import javax.websocket.Session;

public interface Request {
    String toJsonString();
    void execute(Session session);
    RequestsServiceContractType getTypeID();
    // set by default. No changes
    //void setTypeID(NotificationsServiceContractType t);
}