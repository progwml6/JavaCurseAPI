package com.feed_the_beast.javacurselib.utils;

import com.feed_the_beast.javacurselib.common.enums.GroupPermissions;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.Set;

public class EnumSetTypeAdapterFactory implements TypeAdapterFactory {
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        Class<T> rawType = (Class<T>) type.getRawType();
        if (!rawType.getName().equals("java.util.Set")) {
            return null;
        }

        // if unsupported enumType return null ?

        return (TypeAdapter<T>) new EnumSetTypeAdapter(type);
        //return new EnumSetTypeAdapter();
    }

    private static final class EnumSetTypeAdapter extends TypeAdapter<Set> {
        private TypeToken type;

        private EnumSetTypeAdapter(TypeToken type) {
            this.type = type;
        }

        @Override
        public void write(JsonWriter out, Set value) throws IOException {
            out.value(GroupPermissions.serialize(value));
        }

        @Override
        public Set read(JsonReader in) throws IOException {
            Set result;
            if ( in.peek() == JsonToken.NULL ) {
                in.nextNull();
                return null;
            }

            result = GroupPermissions.deserialize(in.nextLong());
            return result;
        }
    }
}
