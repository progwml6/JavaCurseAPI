package com.feed_the_beast.javacurselib.rest;

import com.feed_the_beast.javacurselib.data.Apis;
import com.feed_the_beast.javacurselib.service.logins.login.LoginRequest;
import com.feed_the_beast.javacurselib.service.logins.login.LoginResponse;
import com.feed_the_beast.javacurselib.service.logins.login.LoginWithNetworkSessionRequest;
import com.feed_the_beast.javacurselib.service.logins.login.RenewTokenResponseContract;
import retrofit2.http.Body;
import retrofit2.http.POST;

import java.util.concurrent.CompletableFuture;


public class LoginsWebService {
    final static String ENDPOINT = Apis.LOGINS;

    public interface Login {
        @POST("/login")
        CompletableFuture<LoginResponse> login(
                @Body LoginRequest loginRequest);

        @POST
        CompletableFuture<RenewTokenResponseContract> login_renew();

        @POST
        CompletableFuture<LoginWithNetworkSessionRequest> login_network_session(
                @Body LoginWithNetworkSessionRequest loginWithNetworkSessionRequest);
    }

    public interface Register {
        // Won't be implemented
    }
}
