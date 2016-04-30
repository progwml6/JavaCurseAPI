package com.feed_the_beast.javacurselib.websocket.messages.requests;

import com.feed_the_beast.javacurselib.service.logins.login.LoginResponse;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionResponse;

import javax.annotation.Nonnull;

/*
 * Server sends back JoinResponse
 */
public class JoinRequest extends BaseRequest implements Request {
    public int TypeID = -2101997347;
    public int UserID;
    public String MachineKey;
    public String SessionID;
    public int Status = 1;              // TODO: add enum for this
    public String ClientVersion = "7.0.19";
    public Object PublicKey = null;
    public int CipherAlgorithm = 0;     // TODO: check: random object or int?
    public int CipherStrength = 0;

    public JoinRequest(@Nonnull LoginResponse loginResponse, @Nonnull CreateSessionResponse sessionResponse) {
        MachineKey = sessionResponse.MachineKey;
        UserID = sessionResponse.User.UserID;
        SessionID = sessionResponse.SessionID;
    }

    @Override
    public int getTypeID() {
        return TypeID;
    }
}