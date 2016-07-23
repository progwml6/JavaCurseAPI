package com.feed_the_beast.javacurselib.websocket;

import com.feed_the_beast.javacurselib.common.enums.GroupPermissions;
import com.feed_the_beast.javacurselib.utils.*;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.NotificationsServiceContractType;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.Response;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.UnknownResponse;
import com.feed_the_beast.javacurselib.websocket.messages.requests.Request;
import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

@SuppressWarnings("Duplicates")
public class JsonFactory {
    public static boolean DEBUG = true;
    public static final Gson GSON;
    static {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(Date.class, new DateAdapter());
        builder.registerTypeAdapterFactory(new BetterEnumAdapterFactory());
        builder.registerTypeAdapterFactory(new EnumSetTypeAdapterFactory(Collections.singletonList(GroupPermissions.class)));
        builder.registerTypeAdapter(Response.class, new ResponseDeserializer());
        builder.registerTypeAdapter(Response.class, new ResponseSerializer());
        builder.registerTypeAdapter(Request.class, new RequestSerializer());
        builder.registerTypeAdapter(CurseGUID.class, new CurseGUIDAdapter());
        builder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);//auto capitalizes first letter of java field when going to json
        builder.enableComplexMapKeySerialization();
        builder.serializeNulls();
        if (DEBUG) {     // TODO change that as soon as there is proper data
            builder.setPrettyPrinting();
        }
        GSON = builder.create();
    }

    public static Response stringToResponse(String s) {
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
