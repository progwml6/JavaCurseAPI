package com.feed_the_beast.javacurselib.utils;

import com.feed_the_beast.javacurselib.data.Apis;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class AuthInjectorInterceptor implements Interceptor {
    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    private String authToken = null;

    @Override
    public Response intercept(Chain chain) throws IOException {
        if (chain.request().url().url().toString().contains(Apis.CURSEAPPBASE)) {
            Request orig = chain.request();
            Request.Builder builder = orig.newBuilder().method(orig.method(), orig.body());
            if (authToken != null && !authToken.isEmpty()) {
                builder.header("AuthenticationToken", authToken);
            }

            Request request = builder.build();
            return chain.proceed(request);
        } else {
            return chain.proceed(chain.request());
        }
    }
}
