package com.feed_the_beast.javacurselib.service.conversations.conversations;


import com.feed_the_beast.javacurselib.utils.CurseGUID;

public class ConversationCreateMessageRequest {
    public CurseGUID machineKey;
    public CurseGUID attachmentID;
    public CurseGUID clientID;
    public String body;
    public int attachmentRegionID;
}
