package com.feed_the_beast.javacurselib.service.logins.register;

import com.feed_the_beast.javacurselib.service.logins.login.LoginSession;

/**
 * representation of curse register api RegisterTempResponse
 */
public class RegisterTempResponse {
    public String tempAccountToken;
    public RegisterStatus status;
    public String statusMessage;
    public LoginSession session;
}
