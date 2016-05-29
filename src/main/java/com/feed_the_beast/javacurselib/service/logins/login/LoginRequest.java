package com.feed_the_beast.javacurselib.service.logins.login;

import javax.annotation.Nonnull;

/**
 * representation of curse logins/login api LoginRequest model
 * replies with LoginResponse
 */
public class LoginRequest {
    /**
     *
     * @param username your cursenetwork username
     * @param password your cursenetwork password
     */
    public LoginRequest(@Nonnull String username, @Nonnull String password) {
        this.username = username;
        this.password = password;
    }
    public String username;
    public String password;
}
