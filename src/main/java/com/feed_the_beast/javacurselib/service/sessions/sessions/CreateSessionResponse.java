package com.feed_the_beast.javacurselib.service.sessions.sessions;

import com.feed_the_beast.javacurselib.utils.CurseGUID;

import java.util.List;

/**
 * representation of curse sessions api CreateSessionResponse
 */
public class CreateSessionResponse {
    public CurseGUID sessionID;
    public CurseGUID machineKey;
    public UserContract user;
    public List<DevicePlatform> platforms;

    @Override
    public String toString() {
        return "CreateSessionResponse{" +
                "sessionID=<HIDDEN>" +
                ", machineKey=" + machineKey +
                ", user=" + user +
                ", platforms=" + platforms +
                '}';
    }
}
