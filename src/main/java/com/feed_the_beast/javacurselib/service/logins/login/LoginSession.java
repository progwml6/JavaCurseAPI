package com.feed_the_beast.javacurselib.service.logins.login;

/**
 * representation of curse login api LoginSession model
 */
public class LoginSession {
    public int userID;
    public String username;
    /**
     * this session ID is not usable for the websocket apis
     */
    public String sessionID;
    public String token;
    public String emailAddress;
    public boolean effectivePremiumStatus;
    public boolean actualPremiumStatus;
    public int subscriptionToken;
    public long expires;
    public long renewAfter;
    public boolean isTemporaryAccount;
}
