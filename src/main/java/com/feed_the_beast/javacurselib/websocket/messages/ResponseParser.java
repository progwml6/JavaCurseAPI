package com.feed_the_beast.javacurselib.websocket.messages;


import com.feed_the_beast.javacurselib.utils.DateAdapter;
import com.feed_the_beast.javacurselib.utils.UUIDAdapter;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.*;
import com.feed_the_beast.javacurselib.websocket.messages.requests.Request;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.UUID;


@SuppressWarnings("Duplicates")
public class ResponseParser {
    public static final Gson GSON;
    public static final BiMap<Integer, Class> responseMappings;

    static {
        responseMappings = HashBiMap.create();
        responseMappings.put(-476754606, HandshakeResponse.class);
        responseMappings.put(-815187584, JoinResponse.class);
        responseMappings.put(-635182161, ConversationMessageNotification.class);

        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(Date.class, new DateAdapter());
        builder.registerTypeAdapter(UUID.class, new UUIDAdapter());
        builder.registerTypeAdapter(Response.class, new ResponseDeserializer(responseMappings));
        builder.registerTypeAdapter(Response.class, new ResponseSerializer(responseMappings));
        builder.registerTypeAdapter(Request.class, new RequestSerializer());
        builder.enableComplexMapKeySerialization();
        builder.setPrettyPrinting();
        GSON = builder.create();
    }

    public static Response stringToObject(String s) {
        Response r = GSON.fromJson(s, Response.class);
        r.setOrigMessage(s);
        return r;
    }

    private static class ResponseDeserializer implements JsonDeserializer<Response> {
        private BiMap<Integer, Class> mapping;

        public ResponseDeserializer(BiMap<Integer, Class> mapping) {
            this.mapping = mapping;
        }

        @Override
        public Response deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            JsonElement body = json.getAsJsonObject().get("Body");
            int typeid = json.getAsJsonObject().get("TypeID").getAsInt();

            Response response;
            Class clazz = mapping.get(typeid);
            if (clazz == null) {
                clazz = UnknownResponse.class;
            }

            response = context.deserialize(body, clazz);
            return response;
        }
    }

    private static class ResponseSerializer implements JsonSerializer<Response> {
        BiMap<Integer, Class> mapping;

        public ResponseSerializer(BiMap<Integer, Class> mapping) {
            this.mapping = mapping;
        }

        @Override
        public JsonElement serialize(Response src, Type typeOfSrc, JsonSerializationContext context) {
            JsonObject result = new JsonObject();
            JsonElement body = context.serialize(src, src.getClass());
            result.add("TypeID", new JsonPrimitive(mapping.inverse().get(src.getClass())));
            result.add("Body", body);
            return result;
        }
    }

    private static class RequestSerializer implements JsonSerializer<Request> {
        @Override
        public JsonElement serialize(Request src, Type typeOfSrc, JsonSerializationContext context) {
            JsonObject result = new JsonObject();
            JsonElement body = context.serialize(src, src.getClass());
            result.add("TypeID", new JsonPrimitive(src.getTypeID()));
            result.add("Body", body);
            return result;
        }
    }
}