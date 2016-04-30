package com.feed_the_beast.javacurselib.service.sessions.sessions;

import java.util.List;

/**
 * representation of curse sessions api CreateSessionResponse
 */
public class CreateSessionResponse {
    public String SessionID;
    public String MachineKey;
    public UserContract User;
    public List<DevicePlatform> Platforms;
}
