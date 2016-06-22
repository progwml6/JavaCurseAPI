package com.feed_the_beast.javacurselib.data;

import com.feed_the_beast.javacurselib.utils.CurseGUID;
import com.feed_the_beast.javacurselib.utils.CurseGUIDAdapter;
import com.feed_the_beast.javacurselib.utils.DateAdapter;
import com.feed_the_beast.javacurselib.utils.EnumSetTypeAdapterFactory;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Date;

public class JsonFactory {
    public static final Gson GSON;
    public static boolean DEBUG = true;
    static {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapterFactory(new EnumSetTypeAdapterFactory());
        builder.registerTypeAdapter(Date.class, new DateAdapter());
        builder.registerTypeAdapter(CurseGUID.class, new CurseGUIDAdapter());
        builder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);
        builder.enableComplexMapKeySerialization();
        builder.serializeNulls();
        if (DEBUG) {
            builder.setPrettyPrinting();
        }
        GSON = builder.create();
    }

}