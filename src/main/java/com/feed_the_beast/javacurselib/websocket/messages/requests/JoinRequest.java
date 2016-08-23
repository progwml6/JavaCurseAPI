package com.feed_the_beast.javacurselib.websocket.messages.requests;

import com.feed_the_beast.javacurselib.common.enums.UserConnectionStatus;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionResponse;
import com.feed_the_beast.javacurselib.utils.CurseGUID;

import javax.annotation.Nonnull;

/*
 * Server sends back JoinResponse
 */
public class JoinRequest extends BaseRequest implements Request {
    public long userID;
    public CurseGUID machineKey;
    public CurseGUID sessionID;
    // TODO: requires testing. Current impl sends "ONLINE" which is accepted by server
    // TODO: enum serialization!
    public UserConnectionStatus status = UserConnectionStatus.ONLINE;

    // TODO: make configurable
    public String clientVersion = "7.0.61";

    // Weirdos. Fix after getting API docs
    public Object publicKey = null;
    public int cipherAlgorithm = 0;     // TODO: check: random object or int?
    public int cipherStrength = 0;

    public JoinRequest (@Nonnull CreateSessionResponse sessionResponse) {
        this.machineKey = sessionResponse.machineKey;
        this.userID = sessionResponse.user.userID;
        this.sessionID = sessionResponse.sessionID;
    }

    JoinRequest (long userID, CurseGUID machineKey, CurseGUID sessionID) {
        this.userID = userID;
        this.machineKey = machineKey;
        this.sessionID = sessionID;
    }

    @Override
    public RequestsServiceContractType getTypeID () {
        return RequestsServiceContractType.JOIN_REQUEST;
    }

    @Override
    public String toString () {
        return "JoinRequest{" +
                "userID=" + userID +
                ", machineKey=" + machineKey +
                ", sessionID=" + "<CENSORED>" + // not sure if this leaks information. Better safe than...
                ", status=" + status +
                ", clientVersion='" + clientVersion + '\'' +
                ", publicKey=" + publicKey +
                ", cipherAlgorithm=" + cipherAlgorithm +
                ", cipherStrength=" + cipherStrength +
                '}';
    }
}