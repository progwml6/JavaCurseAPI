package com.feed_the_beat.javacurselib.utils;

import com.feed_the_beast.javacurselib.service.conversations.conversations.ConversationType;
import com.feed_the_beast.javacurselib.utils.BetterEnumAdapterFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BetterEnumAdapterFactoryTest {
    private final static Gson GSON;
    private final static String testString = "{\"ConversationType\":0}";

    static {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapterFactory(new BetterEnumAdapterFactory());
        GSON = builder.create();
    }

    private Helper h;

    @Before
    public void setUp() throws Exception {
        h = GSON.fromJson(testString, Helper.class);

    }

    @Test
    public void deserializer() throws Exception {
        assertTrue(h.conversationType != null);
    }

    @Test
    public void serializer() throws Exception {
        String s =GSON.toJson(h);
        assertEquals(testString, s);
    }

    private class Helper {
        private ConversationType conversationType;
    }
}
