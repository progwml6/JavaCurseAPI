package com.feed_the_beast.javacurselib.data;

import com.feed_the_beast.javacurselib.examples.app_v1.CurseApp;
import com.feed_the_beast.javacurselib.utils.DateAdapter;
import com.feed_the_beast.javacurselib.utils.UUIDAdapter;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Date;
import java.util.UUID;

public class JsonFactory {
    public static final Gson GSON;

    static {
        GsonBuilder builder = new GsonBuilder();
        //builder.registerTypeAdapterFactory(new EnumAdaptorFactory());
        builder.registerTypeAdapter(Date.class, new DateAdapter());
        builder.registerTypeAdapter(UUID.class, new UUIDAdapter());
        builder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);
        builder.enableComplexMapKeySerialization();
        if (CurseApp.isDebugMode()) {
            builder.setPrettyPrinting();
        }
        GSON = builder.create();
    }

}