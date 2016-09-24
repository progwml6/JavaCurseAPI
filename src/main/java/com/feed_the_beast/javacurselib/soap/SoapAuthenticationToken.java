package com.feed_the_beast.javacurselib.soap;

public class SoapAuthenticationToken {
    public SoapAuthenticationToken (long UserID, String Token, String ApiKey) {
        this.UserID = UserID;
        this.Token = Token;
        this.ApiKey = ApiKey;
    }
    public SoapAuthenticationToken (long UserID, String Token) {
        this.UserID = UserID;
        this.Token = Token;
    }


    public long UserID;

    public String Token;

    public String ApiKey = null;

}
