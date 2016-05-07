package com.feed_the_beast.javacurselib.service.sessions.sessions;

import com.feed_the_beast.javacurselib.CurseGUID;


/**
 * representation of curse sessions api CreateSessionRequest
 * replies with CreateSessionResponse
 */
public class CreateSessionRequest {
    public CreateSessionRequest(CurseGUID machineKey, DevicePlatform platform, String deviceId, String pushKitToken) {
        this.machineKey = machineKey;
        this.platform = platform;
        this.deviceID = deviceId;
        this.pushKitToken = pushKitToken;
    }

    public CreateSessionRequest(CurseGUID machineKey, DevicePlatform platform) {
        this(machineKey, platform, null, null);
    }
    public CurseGUID machineKey;
    public DevicePlatform platform;
    public String deviceID;
    public String pushKitToken;
}
