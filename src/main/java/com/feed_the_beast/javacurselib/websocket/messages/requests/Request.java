package com.feed_the_beast.javacurselib.websocket.messages.requests;

import javax.annotation.Nonnull;
import javax.websocket.Session;

public interface Request {
    String toJsonString();
    RequestsServiceContractType getTypeID();
    // set by default. No changes
    //void setTypeID(NotificationsServiceContractType t);
}