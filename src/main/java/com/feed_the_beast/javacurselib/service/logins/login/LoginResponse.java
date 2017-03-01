package com.feed_the_beast.javacurselib.service.logins.login;

import lombok.ToString;

/**
 * representation of curse login api LoginResponse
 */
@ToString
public class LoginResponse {
    public LoginStatus status;
    public String statusMessage;
    public LoginSession session;
    public String twitchUsernameReservationToken;
}
