package com.feed_the_beast.javacurselib.rest;

import com.feed_the_beast.javacurselib.data.Apis;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionRequest;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionResponse;
import com.feed_the_beast.javacurselib.utils.CurseGUID;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.concurrent.CompletableFuture;


public class SessionsWebService {
    final static String ENDPOINT = Apis.SESSIONS;

    public interface Sessions {

        @POST("/sessions")
        CompletableFuture<CreateSessionResponse> create(
                @Body CreateSessionRequest createSessionRequest);

        // HTTP return code. TODO: test/no body at all?
        @DELETE("/sessions")
        CompletableFuture<Void> delete(
                @Body CreateSessionRequest createSessionRequest);

        // TODO: add class
        @Deprecated
        @POST("/sessions/{machineKey}/tokens")
        CompletableFuture<Void> doSomethingWithTokens(
                // TODO: fix */ @Body UpdateDeviceTokensRequest updateDeviceTokensRequest,
                @Path("machineKey") CurseGUID machineKey);

        @DELETE("sessions/{machineKey}/tokens/{deviceID}")
        CompletableFuture<Void> delete(
                @Path("machineKey") CurseGUID machineKey,
                @Path("deviceID") String deviceID
        );
    }
}