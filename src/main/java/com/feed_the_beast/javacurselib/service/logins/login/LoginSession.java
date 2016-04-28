package com.feed_the_beast.javacurselib.service.logins.login;

/**
 * representation of curse login api LoginSession model
 */
public class LoginSession {
    public int UserID;
    public String Username;
    public String SessionID;
    public String Token;
    public String EmailAddress;
    public boolean EffectivePremiumStatus;
    public boolean ActualPremiumStatus;
    public int SubscriptionToken;
    public int Expires;
    public int RenewAfter;
    public boolean IsTemporaryAccount;
}
