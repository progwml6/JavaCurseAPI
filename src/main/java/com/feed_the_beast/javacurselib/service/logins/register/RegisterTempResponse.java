package com.feed_the_beast.javacurselib.service.logins.register;

import com.feed_the_beast.javacurselib.service.logins.login.LoginSession;

/**
 * representation of curse register api RegisterTempResponse
 */
public class RegisterTempResponse {
    public String TempAccountToken;
    public RegisterStatus Status;
    public String StatusMessage;
    public LoginSession Session;
}
