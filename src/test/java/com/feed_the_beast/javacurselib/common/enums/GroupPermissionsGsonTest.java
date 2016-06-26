package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.EnumSetTypeAdapterFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;

import static org.junit.Assert.*;

public class GroupPermissionsGsonTest {
    private final static String NONE = "{ \"SenderPermissions\":0 }";
    private final static String ALL = "{ \"SenderPermissions\":-1 }";
    private final static String ONE = "{ \"SenderPermissions\":1 }";
    private final static String MODERATOR = "{ \"SenderPermissions\":296743969 }";
    private final static String EVERYONE = "{ \"SenderPermissions\":19341313 }";
    private final static String EVERYONEEVERYONE = "{ \"SenderPermissions\":23535617 }";
    private final static Gson GSON;

    static {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapterFactory(new EnumSetTypeAdapterFactory(Arrays.asList(GroupPermissions.class)));
        GSON = builder.create();
    }

    @Test
    public void name() throws Exception {
        assertEquals(GroupPermissions.NONE, GSON.fromJson(NONE , Helper.class).SenderPermissions);
        assertEquals(GroupPermissions.ALL, GSON.fromJson(ALL , Helper.class).SenderPermissions);
        assertEquals(EnumSet.of(GroupPermissions.ACCESS), GSON.fromJson(ONE , Helper.class).SenderPermissions);
        assertEquals(296743969, GroupPermissions.serialize(GSON.fromJson(MODERATOR, Helper.class).SenderPermissions));
    }

    private static class Helper {
        Set<GroupPermissions> SenderPermissions;
    }
}
