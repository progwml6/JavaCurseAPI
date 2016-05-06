package com.feed_the_beast.javacurselib.websocket.messages.notifications;

import javax.annotation.Nonnull;

public interface Response {
    String toJsonString();
    String getOrigMessage();
    void setOrigMessage(@Nonnull String s);
    NotificationsServiceContractType getTypeID();
    void setTypeID(@Nonnull NotificationsServiceContractType t);

}