package com.feed_the_beast.javacurselib.websocket.messages.notifications;

public interface Response {
    String toJsonString();
    String getOrigMessage();
    void setOrigMessage(String s);
    NotificationsServiceContractType getTypeID();
    void setTypeID(NotificationsServiceContractType t);

}