package com.feed_the_beast.javacurselib.utils;

import com.feed_the_beast.javacurselib.utils.DateAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import uk.co.datumedge.hamcrest.json.SameJSONAs;

import java.util.Date;

import static org.junit.Assert.*;

public class DateAdapterTest2 {
    private static Gson ownImpl;

    // from ConversationMarkReadNotification
    private static String testString = "{\"date\":\"2016-05-07T12:49:09.334Z\"}";

    static {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(Date.class, new DateAdapter());
        ownImpl = builder.create();
    }

    private DateContainingClass c;
    private Date own;


    @Before
    public void setUp() throws Exception {
        c = ownImpl.fromJson(testString, DateContainingClass.class);
        own = c.date;
    }

    @Ignore
    @Test
    public void debug() {
        System.out.println(own);
    }

    @Test
    public void testMediumSizedDateTimeString() {
        // just test to execute setUp to see if Exception thrown
    }

    private static class DateContainingClass {
        Date date;
    }
}
