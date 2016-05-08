package com.feed_the_beast.javacurselib.rest;

import com.feed_the_beast.javacurselib.service.logins.login.LoginRequest;
import com.feed_the_beast.javacurselib.service.logins.login.LoginResponse;
import retrofit2.http.Body;
import retrofit2.http.POST;

import java.util.concurrent.CompletableFuture;


public interface LoginsWebService {
    @POST("/login")
    CompletableFuture<LoginResponse> login2(@Body LoginRequest loginRequest);
}
