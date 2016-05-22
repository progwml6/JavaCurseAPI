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
    public static LoginsWebService login;
    public static SessionsWebService session;
    public static ContactWebService.Contacts contacts;
    public static ContactWebService.Users users;
    public static ConversationsWebService conversations;
    public static GroupsWebService.Servers servers;

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

        // TODO: some of the LoginsWebService calls might require auth token, check later
        login = builder.baseUrl(Apis.LOGINS).build().create(LoginsWebService.class);

        // Rest of the endpoints requires auth token in headers
        builder.client(okClient);

        session = builder.baseUrl(Apis.SESSIONS).build().create(SessionsWebService.class);

        contacts = builder.baseUrl(Apis.CONTACTS).build().create(ContactWebService.Contacts.class);

        servers = builder.baseUrl(Apis.GROUPS).build().create(GroupsWebService.Servers.class);

        users = builder.baseUrl(Apis.CONTACTS).build().create(ContactWebService.Users.class);

        conversations = builder.baseUrl(Apis.CONVERSATIONS).build().create(ConversationsWebService.class);


    }

    private REST() {}
}
