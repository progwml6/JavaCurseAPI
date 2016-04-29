package com.feed_the_beast.javacurselib.service.logins.login;

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
    public LoginRequest(String username, String password) {
        this.Username = username;
        this.Password = password;
    }
    public String Username;
    public String Password;
}
