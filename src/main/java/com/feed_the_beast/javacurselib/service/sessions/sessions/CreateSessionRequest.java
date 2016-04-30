package com.feed_the_beast.javacurselib.service.sessions.sessions;

import java.util.UUID;

/**
 * representation of curse sessions api CreateSessionRequest
 * replies with CreateSessionResponse
 */
public class CreateSessionRequest {
    public CreateSessionRequest(UUID machineKey, DevicePlatform platform, String deviceId, String pushKitToken) {
        this.MachineKey = machineKey;
        this.Platform = platform;
        this.DeviceID = deviceId;
        this.PushKitToken = pushKitToken;
    }

    public CreateSessionRequest(UUID machineKey, DevicePlatform platform) {
        this(machineKey, platform, null, null);
    }
    public UUID MachineKey;
    public DevicePlatform Platform;
    public String DeviceID;
    public String PushKitToken;
}
