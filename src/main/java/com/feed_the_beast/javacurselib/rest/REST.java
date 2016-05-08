package com.feed_the_beast.javacurselib.rest;

import com.feed_the_beast.javacurselib.data.Apis;
import com.feed_the_beast.javacurselib.data.JsonFactory;
import com.feed_the_beast.javacurselib.utils.retrofit.GsonConverterFactory;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.java8.Java8CallAdapterFactory;

import javax.annotation.Nonnull;
import java.io.IOException;

// TODO: should not be static class: fix

public class REST {
    public static LoginsWebService loginsWebService;
    public static SessionsWebService sessionsWebService;

    public static void setAuthToken(@Nonnull String authToken) {
        REST.authToken = authToken;
    }

    private static String authToken = null;

    static {
        OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();
        clientBuilder.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request orig = chain.request();

                Request request = orig.newBuilder()
                        .header("AuthenticationToken", authToken)
                        .method(orig.method(), orig.body())
                        .build();

                return chain.proceed(request);
            }
        });

        OkHttpClient okClient = clientBuilder.build();

        Retrofit.Builder builder= new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(JsonFactory.GSON))
                .addCallAdapterFactory(Java8CallAdapterFactory.create());

        // TODO: some of the loginsWebService might require auth token, check
        loginsWebService = builder.baseUrl(Apis.LOGINS).build().create(LoginsWebService.class);

        // Rest of the endpoints requires auth token in headers
        builder.client(okClient);

        //TODO: create other endpoints
        sessionsWebService = builder.baseUrl(Apis.SESSIONS).build().create(SessionsWebService.class);
    }

    private REST() {}
}
