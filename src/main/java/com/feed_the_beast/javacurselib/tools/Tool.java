package com.feed_the_beast.javacurselib.tools;

import com.feed_the_beast.javacurselib.data.JsonFactory;
import com.feed_the_beast.javacurselib.rest.RestUserEndpoints;
import com.feed_the_beast.javacurselib.service.logins.login.LoginResponse;
import okhttp3.logging.HttpLoggingInterceptor;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Tool {
    static LoginResponse lr;

    public static RestUserEndpoints init() throws Exception {
        String path = System.getenv("LR");
        if (path != null && !path.isEmpty()) {
            return init(path);
        }
        throw new RuntimeException("Bad value in environment variable");
    }

    public static RestUserEndpoints init(String path) throws Exception {
        String s = new String(Files.readAllBytes(Paths.get(path)));
        lr = JsonFactory.GSON.fromJson(s, LoginResponse.class);

        // start creating REST endpoints
        RestUserEndpoints endpoints = new RestUserEndpoints();
        endpoints.addInterceptor(new HttpLoggingInterceptor(new Slf4jHttpLoggingInterceptor()).setLevel(HttpLoggingInterceptor.Level.BODY));
        endpoints.setAuthToken(lr.session.token);
        endpoints.setupEndpoints();

        return endpoints;
    }
}
