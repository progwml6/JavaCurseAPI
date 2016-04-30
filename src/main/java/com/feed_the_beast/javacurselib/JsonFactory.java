package com.feed_the_beast.javacurselib;

import com.feed_the_beast.javacurselib.utils.DateAdapter;
import com.feed_the_beast.javacurselib.utils.EnumAdaptorFactory;
import com.feed_the_beast.javacurselib.utils.UUIDAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Date;
import java.util.UUID;

public class JsonFactory {
    public static final Gson GSON;

    static {//TODO add map<Integer, Integer type adapter and GUID one if needed
        GsonBuilder builder = new GsonBuilder();
        //builder.registerTypeAdapterFactory(new EnumAdaptorFactory());
        builder.registerTypeAdapter(Date.class, new DateAdapter());
        builder.registerTypeAdapter(UUID.class, new UUIDAdapter());
        builder.enableComplexMapKeySerialization();
        builder.setPrettyPrinting();
        GSON = builder.create();
    }

}