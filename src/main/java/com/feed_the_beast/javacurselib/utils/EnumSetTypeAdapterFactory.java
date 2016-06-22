package com.feed_the_beast.javacurselib.utils;

import com.feed_the_beast.javacurselib.common.enums.GroupPermissions;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Set;

@Slf4j
public class EnumSetTypeAdapterFactory implements TypeAdapterFactory {

    // TODO: add constructor and save allowed Enums

    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        Class<T> rawType = (Class<T>) type.getRawType();
        if (!rawType.getName().equals("java.util.Set")) {
            return null;
        }

        /*
        System.out.println(rawType.getTypeName());
        System.out.println(Arrays.toString(rawType.getTypeParameters()));
        System.out.println(rawType.getName());
        System.out.println(type);
        */
        Type type2 = type.getType();
        Method m = null;
        try {
            m = type2.getClass().getDeclaredMethod("getActualTypeArguments", null);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


        m.setAccessible(true);

        Type[] ret = null;
        try {
            ret = (Type[]) m.invoke(type2);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.println(Arrays.toString(ret));

        if (ret[0] != GroupPermissions.class) {
            // todo: check if this particular enum is in allowed list
            return null;
        }

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
