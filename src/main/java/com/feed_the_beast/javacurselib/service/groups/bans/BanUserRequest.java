package com.feed_the_beast.javacurselib.service.groups.bans;

public class BanUserRequest {
    public int userID;
    public String reason;
    public boolean banIP;
    //default ban deletion to old behavior
    public BanUserMessageDeleteMode messageDeleteMode = BanUserMessageDeleteMode.NONE;
}
