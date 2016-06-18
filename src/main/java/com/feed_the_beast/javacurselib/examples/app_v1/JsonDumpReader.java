package com.feed_the_beast.javacurselib.examples.app_v1;

import com.feed_the_beast.javacurselib.websocket.JsonFactory;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.Response;
import com.google.gson.JsonStreamParser;

import java.io.FileNotFoundException;
import java.io.FileReader;

// TODO: configure this parser as pedantic as possible
public class JsonDumpReader {
    public static void main(String[] args) {
        String file = System.getenv("JAVACURSEAPI_JSONDUMPS");
        if (file != null && !file.isEmpty()) {
            read(file);
        }
    }

    public static void read(String file) {
        JsonStreamParser parser = null;
        try {
            parser = new JsonStreamParser(new FileReader(file));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (parser.hasNext()) {
            System.out.println("==================");
            System.out.println(JsonFactory.GSON.fromJson(parser.next(), Response.class));
        }
    }
}
