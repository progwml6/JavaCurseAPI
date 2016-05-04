package com.feed_the_beast.javacurselib.service.sessions.sessions;

import java.util.UUID;

/**
 * representation of curse sessions api CreateSessionRequest
 * replies with CreateSessionResponse
 */
public class CreateSessionRequest {
    public CreateSessionRequest(UUID machineKey, DevicePlatform platform, String deviceId, String pushKitToken) {
        this.machineKey = machineKey;
        this.platform = platform;
        this.deviceID = deviceId;
        this.pushKitToken = pushKitToken;
    }

    public CreateSessionRequest(UUID machineKey, DevicePlatform platform) {
        this(machineKey, platform, null, null);
    }
    public UUID machineKey;
    public DevicePlatform platform;
    public String deviceID;
    public String pushKitToken;
}
