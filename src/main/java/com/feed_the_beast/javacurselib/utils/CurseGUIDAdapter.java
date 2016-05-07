package com.feed_the_beast.javacurselib.utils;

import com.feed_the_beast.javacurselib.CurseGUID;
import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.logging.Logger;


public class CurseGUIDAdapter implements JsonSerializer<CurseGUID>, JsonDeserializer<CurseGUID> {
    private static final Logger logger = Logger.getLogger(CurseGUIDAdapter.class.getName());
    @Override
    public CurseGUID deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        CurseGUID result;
        String s = json.getAsString();
        try {
            result = CurseGUID.deserialize(s);
        } catch (IllegalStateException e) {
            throw new JsonParseException("Unable to parse string " + s, e);
        }
        return result;
    }

    @Override
    public JsonElement serialize(CurseGUID src, Type typeOfSrc, JsonSerializationContext context) {
        return new JsonPrimitive(src.serialize());
    }
}
