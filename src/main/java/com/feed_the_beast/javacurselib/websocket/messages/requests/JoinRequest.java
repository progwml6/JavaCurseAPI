package com.feed_the_beast.javacurselib.websocket.messages.requests;

import com.feed_the_beast.javacurselib.service.logins.login.LoginResponse;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionResponse;

import javax.annotation.Nonnull;

/*
 * Server sends back JoinResponse
 */
public class JoinRequest extends BaseRequest implements Request {
    public int userID;
    public String machineKey;
    public String sessionID;
    public int status = 1;              // TODO: add enum for this
    public String clientVersion = "7.0.19";
    public Object publicKey = null;
    public int cipherAlgorithm = 0;     // TODO: check: random object or int?
    public int cipherStrength = 0;

    public JoinRequest(@Nonnull LoginResponse loginResponse, @Nonnull CreateSessionResponse sessionResponse) {
        machineKey = sessionResponse.machineKey;
        userID = sessionResponse.user.userID;
        sessionID = sessionResponse.sessionID;
    }

    @Override
    public RequestsServiceContractType getTypeID() {
        return RequestsServiceContractType.JOIN_REQUEST;
    }
}