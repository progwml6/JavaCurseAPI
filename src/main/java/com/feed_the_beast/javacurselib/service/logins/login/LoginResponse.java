package com.feed_the_beast.javacurselib.service.logins.login;

/**
 * representation of curse login api LoginResponse
 */
public class LoginResponse {
    public LoginStatus status;
    public String statusMessage;
    public LoginSession session;

    @Override
    public String toString() {
        return "LoginResponse{" +
                "status=" + status +
                ", statusMessage='" + statusMessage + '\'' +
                ", session=" + session +
                '}';
    }
}
