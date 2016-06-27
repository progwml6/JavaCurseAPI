package com.feed_the_beast.javacurselib.websocket.messages.notifications;

import com.feed_the_beast.javacurselib.common.enums.CallType;
import lombok.ToString;

import java.util.Date;

@ToString
public class CallNotification extends BaseResponse implements Response {
    public String hostName;
    public String ipAddress;
    public Long accessToken;
    public Long hostID;
    public String regionName;
    public String inviteUrl;
    public String inviteCode;
    public CallType callType;
    public String callID;
    public String conversationID;
    public Long creatorID;
    public String creatorName;
    public Long gameID;        // optional in RI
    public Long autoMatchKey;  // optional in RI
    public Date timestamp;
    public Long senderID;
    public String senderName;
    public boolean forceJoin;
}
