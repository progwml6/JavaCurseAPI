package com.feed_the_beast.javacurselib.websocket.messages.notifications;

import com.feed_the_beast.javacurselib.websocket.messages.notifications.enums.JoinStatus;

import java.util.Date;

public class JoinResponse extends BaseResponse implements Response {
    public JoinStatus status;
    public Date serverTime;
    public String encryptedSessionKey;

    @Override
    public String toString() {
        return "JoinResponse{" +
                "status=" + status +
                ", serverTime=" + serverTime +
                ", encryptedSessionKey='" + encryptedSessionKey + '\'' +
                '}';
    }
}
