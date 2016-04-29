package com.feed_the_beast.javacurselib.utils;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;
import java.util.UUID;

/**
 * Created by progwml6 on 4/28/16.
 */
public class UUIDAdapter implements JsonSerializer<UUID>, JsonDeserializer<UUID> {

    public JsonElement serialize (UUID src, Type typeOfSrc,
            JsonSerializationContext context) {
        return new JsonPrimitive(src.toString());
    }

    public UUID deserialize (JsonElement json, Type typeOfT,
            JsonDeserializationContext context)
            throws JsonParseException {
        return UUID.fromString(json.getAsString());
    }

    @Override
    public String toString () {
        return UUIDAdapter.class.getSimpleName();
    }
}
