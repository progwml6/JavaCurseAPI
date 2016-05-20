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
    public long subscriptionToken;
    public long expires;
    public long renewAfter;
    public boolean isTemporaryAccount;

    @Override
    public String toString() {
        return "LoginSession{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", sessionID='<HIDDEN>'" +
                ", token=<HIDDEN" +
                ", emailAddress='<HIDDEN>'" +
                ", effectivePremiumStatus=" + effectivePremiumStatus +
                ", actualPremiumStatus=" + actualPremiumStatus +
                ", subscriptionToken=" + subscriptionToken +
                ", expires=" + expires +
                ", renewAfter=" + renewAfter +
                ", isTemporaryAccount=" + isTemporaryAccount +
                '}';
    }
}