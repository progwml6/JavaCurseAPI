package com.feed_the_beast.javacurselib.utils;

import com.feed_the_beast.javacurselib.CurseGUID;
import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.logging.Logger;


public class CurseGUIDAdapter implements JsonSerializer<CurseGUID>, JsonDeserializer<CurseGUID> {
    private static final Logger logger = Logger.getLogger(CurseGUIDAdapter.class.getName());
    @Override
    public CurseGUID deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        String s = json.getAsString();
        CurseGUID result;
        if (s.matches("[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}")) {
            result = CurseGUID.newFromString(s);
        } else if (s.matches("[0-9]*")) {
            long l = Long.parseLong(s);
            result = CurseGUID.newFromLong(l);
        } else if (s.matches("[0-9]*:[0-9]*")) {
            String[] splitted = s.split(":");
            long l = Long.parseLong(splitted[0]);
            long r = Long.parseLong(splitted[1]);
            result = CurseGUID.newFromLong(l, r);
        } else {
            throw new JsonParseException("Unable to parse " + s);
        }
        return result;
    }

    @Override
    public JsonElement serialize(CurseGUID src, Type typeOfSrc, JsonSerializationContext context) {
        switch (src.getType()) {
            case UUID:
                return new JsonPrimitive(src.getUuid().toString());
            case INT:
                return new JsonPrimitive(Long.toString(src.getIntLeft()));
            case TWO_INTS:
                return new JsonPrimitive(Long.toString(src.getIntLeft()) + ":" + Long.toString(src.getIntRight()));
        }
        return null;
    }
}
