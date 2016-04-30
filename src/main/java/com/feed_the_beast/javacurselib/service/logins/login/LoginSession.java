package com.feed_the_beast.javacurselib.service.logins.login;

/**
 * representation of curse login api LoginSession model
 */
public class LoginSession {
    public int UserID;
    public String Username;
    /**
     * this session ID is not usable for the websocket apis
     */
    public String SessionID;
    public String Token;
    public String EmailAddress;
    public boolean EffectivePremiumStatus;
    public boolean ActualPremiumStatus;
    public int SubscriptionToken;
    public long Expires;
    public long RenewAfter;
    public boolean IsTemporaryAccount;
}
