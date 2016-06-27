package com.feed_the_beast.javacurselib.websocket.messages.requests;

public interface Request {
    String toJsonString();
    RequestsServiceContractType getTypeID();
}