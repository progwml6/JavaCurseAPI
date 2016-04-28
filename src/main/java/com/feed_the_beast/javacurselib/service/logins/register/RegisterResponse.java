package com.feed_the_beast.javacurselib.service.logins.register;

import com.feed_the_beast.javacurselib.service.logins.login.LoginSession;

/**
 * representation of curse register api RegisterResponse
 */
public class RegisterResponse {
    public RegisterStatus Status;
    public String StatusMessage;
    public LoginSession Session;
}
