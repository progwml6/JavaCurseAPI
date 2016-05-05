package com.feed_the_beast.javacurselib.websocket.messages;

import com.feed_the_beast.javacurselib.CurseApp;
import com.feed_the_beast.javacurselib.utils.DateAdapter;
import com.feed_the_beast.javacurselib.utils.UUIDAdapter;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.*;
import com.feed_the_beast.javacurselib.websocket.messages.requests.Request;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.UUID;

@SuppressWarnings("Duplicates")
public class ResponseParser {
    public static final Gson GSON;

    static {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(Date.class, new DateAdapter());
        builder.registerTypeAdapter(UUID.class, new UUIDAdapter());
        builder.registerTypeAdapter(Response.class, new ResponseDeserializer());
        builder.registerTypeAdapter(Response.class, new ResponseSerializer());
        builder.registerTypeAdapter(Request.class, new RequestSerializer());
        builder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);//auto capitalizes first letter of java field when going to json
        builder.enableComplexMapKeySerialization();
        if (CurseApp.isDebugMode()) {
            builder.setPrettyPrinting();
        }
        GSON = builder.create();
    }

    public static Response stringToObject (String s) {
        Response r = GSON.fromJson(s, Response.class);
        r.setOrigMessage(s);
        return r;
    }

    private static class ResponseDeserializer implements JsonDeserializer<Response> {
        @Override
        public Response deserialize (JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            JsonElement body = json.getAsJsonObject().get("Body");
            int typeid = json.getAsJsonObject().get("TypeID").getAsInt();

            Response response;
            Class clazz = NotificationsServiceContractType.getEnumForValue(typeid).getClazz();
            if (clazz == null) {
                clazz = UnknownResponse.class;
            }

            response = context.deserialize(body, clazz);
            response.setTypeID(NotificationsServiceContractType.getEnumForValue(typeid));
            return response;
        }
    }

    /**
     * Probably not needed for anything but helpful for testing later
     */
    private static class ResponseSerializer implements JsonSerializer<Response> {
        @Override
        public JsonElement serialize (Response src, Type typeOfSrc, JsonSerializationContext context) {
            JsonObject result = new JsonObject();
            JsonElement body = context.serialize(src, src.getClass());
            result.add("TypeID", new JsonPrimitive(src.getTypeID().getValue())); // TODO: should we save this value into objects at all?
            result.add("Body", body);
            return result;
        }
    }

    private static class RequestSerializer implements JsonSerializer<Request> {
        @Override
        public JsonElement serialize (Request src, Type typeOfSrc, JsonSerializationContext context) {
            JsonObject result = new JsonObject();
            JsonElement body = context.serialize(src, src.getClass());
            result.add("TypeID", new JsonPrimitive(src.getTypeID().getValue()));
            result.add("Body", body);
            return result;
        }
    }
}