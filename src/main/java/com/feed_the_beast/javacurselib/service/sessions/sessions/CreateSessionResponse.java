package com.feed_the_beast.javacurselib.service.sessions.sessions;

import java.util.List;
import java.util.UUID;

/**
 * representation of curse sessions api CreateSessionResponse
 */
public class CreateSessionResponse {
    public UUID sessionID;
    public UUID machineKey;
    public UserContract user;
    public List<DevicePlatform> platforms;
}
