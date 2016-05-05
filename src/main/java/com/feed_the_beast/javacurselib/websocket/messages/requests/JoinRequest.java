package com.feed_the_beast.javacurselib.websocket.messages.requests;

import com.feed_the_beast.javacurselib.service.contacts.contacts.UserConnectionStatus;
import com.feed_the_beast.javacurselib.service.logins.login.LoginResponse;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionResponse;

import javax.annotation.Nonnull;
import java.util.UUID;

/*
 * Server sends back JoinResponse
 */
public class JoinRequest extends BaseRequest implements Request {
    public long userID;
    public UUID machineKey;
    public UUID sessionID;
    // TODO: requires testing. Current impl sends "ONLINE" which is accepted by server
    // TODO: enum serialization!
    public UserConnectionStatus status = UserConnectionStatus.ONLINE ;

    // TODO: make configurable
    public String clientVersion = "7.0.19";

    // Weirdos. Fix after getting API docs
    public Object publicKey = null;
    public int cipherAlgorithm = 0;     // TODO: check: random object or int?
    public int cipherStrength = 0;

    public JoinRequest(@Nonnull LoginResponse loginResponse, @Nonnull CreateSessionResponse sessionResponse) {
        this.machineKey = sessionResponse.machineKey;
        this.userID = sessionResponse.user.userID;
        this.sessionID = sessionResponse.sessionID;
    }

    JoinRequest(long userID, UUID machineKey, UUID sessionID) {
        this.userID = userID;
        this.machineKey = machineKey;
        this.sessionID = sessionID;
    }

    @Override
    public RequestsServiceContractType getTypeID() {
        return RequestsServiceContractType.JOIN_REQUEST;
    }
}