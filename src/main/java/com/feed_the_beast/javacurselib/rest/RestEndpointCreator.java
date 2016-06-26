package com.feed_the_beast.javacurselib.rest;

import com.feed_the_beast.javacurselib.data.JsonFactory;
import com.feed_the_beast.javacurselib.utils.retrofit.GsonConverterFactory;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.java8.Java8CallAdapterFactory;

import java.util.ArrayList;
import java.util.List;

public class RestEndpointCreator {
    private List<Interceptor> interceptors = new ArrayList<>();
    public RestEndpointCreator() {
    }

    public RestEndpointCreator addInterceptor(Interceptor interceptor) {
        interceptors.add(interceptor);
        return this;
    }

    private OkHttpClient createClient() {
        OkHttpClient okClient;

        OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();
        for (Interceptor interceptor: interceptors) {
            clientBuilder.addInterceptor(interceptor);
        }

        okClient = clientBuilder.build();
        return okClient;
    }

    public <T> T createEndpoint(Class<T> clazz) {
        final String endpoint;

        // warning: ugly code here.
        try {
            endpoint = (String)clazz.getEnclosingClass().getDeclaredField("ENDPOINT").get(null);
        } catch (NoSuchFieldException|IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return createEndpoint(endpoint, clazz);
    }

    // creates client per endpoint. Good or not? Closing okio daemons is hard...
    public <T> T createEndpoint(String endpoint, Class<T> clazz) {
        Retrofit.Builder builder;
        OkHttpClient client = createClient();
        builder = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(JsonFactory.GSON))
                .addCallAdapterFactory(Java8CallAdapterFactory.create());

        return builder.baseUrl(endpoint).client(client).build().create(clazz);
    }
}
