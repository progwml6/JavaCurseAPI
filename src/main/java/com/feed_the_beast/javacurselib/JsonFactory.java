package com.feed_the_beast.javacurselib;

import com.feed_the_beast.javacurselib.utils.EnumAdaptorFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by progwml6 on 4/27/16.
 */
public class JsonFactory {
    public static final Gson GSON;

    static {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapterFactory(new EnumAdaptorFactory());
        builder.enableComplexMapKeySerialization();
        builder.setPrettyPrinting();
        GSON = builder.create();
    }

}