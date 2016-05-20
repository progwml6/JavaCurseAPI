package com.feed_the_beast.javacurselib.rest;

import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionRequest;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionResponse;
import com.feed_the_beast.javacurselib.utils.CurseGUID;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.concurrent.CompletableFuture;


public interface SessionsWebService {
    @POST("/sessions")
    CompletableFuture<CreateSessionResponse> postSessions(
            @Body CreateSessionRequest createSessionRequest);

    // HTTP return code. TODO: test/no body at all?
    @DELETE("/sessions")
    CompletableFuture<Void> deleteSessions(
            @Body CreateSessionRequest createSessionRequest);

    // TODO: add class
    @POST("/sessions/{machineKey}/tokens")
    CompletableFuture<Void> postSessions_machineKey_tokens(
            // TODO: fix */ @Body UpdateDeviceTokensRequest updateDeviceTokensRequest,
            @Path("machineKey") CurseGUID machineKey);

    @DELETE("sessions/{machineKey}/tokens/{deviceID}")
    CompletableFuture<Void> deleteSessions_machineKey_tokens_deviceID(
            @Path("machineKey") CurseGUID machineKey,
            @Path("deviceID") String deviceID
    );
}
