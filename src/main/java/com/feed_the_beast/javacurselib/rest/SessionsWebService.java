package com.feed_the_beast.javacurselib.rest;

import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionRequest;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionResponse;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

import java.util.concurrent.CompletableFuture;


public interface SessionsWebService {
    @POST("/sessions")
    CompletableFuture<CreateSessionResponse> postSessions2(@Body CreateSessionRequest createSessionRequest, @Header("AuthenticationToken") String token);
}
