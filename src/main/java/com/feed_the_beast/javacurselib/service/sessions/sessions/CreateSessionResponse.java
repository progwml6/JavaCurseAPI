package com.feed_the_beast.javacurselib.service.sessions.sessions;

import java.util.List;

/**
 * representation of curse sessions api CreateSessionResponse
 */
public class CreateSessionResponse {
    public String sessionID;
    public String machineKey;
    public UserContract user;
    public List<DevicePlatform> platforms;
}
