package com.feed_the_beast.javacurselib.examples.app_v1;


import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.RawTask;

import javax.annotation.Nonnull;
import java.io.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class JsonDiskWriter implements RawTask {
    private final JsonSaver jsonSaver;

    public JsonDiskWriter(File file) {
        this.jsonSaver = new JsonSaver(file);
        this.jsonSaver.start();
    }

    public JsonDiskWriter(String file) {
        this(new File(file));
    }

    public void write (String json) {
        jsonSaver.add(json);
    }

    @Override
    public void execute(@Nonnull String message) {
        write(message);
    }

    private static class JsonSaver extends Thread {
        private  BlockingQueue<String> toWrite;
        private  BufferedWriter writer;

        public JsonSaver(File file) {
            try {
                this.toWrite = new LinkedBlockingQueue<>();
                this.writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
                this.setName("Json Entry saver thread");
                this.setDaemon(true);
            } catch (Exception e) {
                // just fail. User explicitly requested this
                throw new RuntimeException(e);
            }
        }

        public void add(String s) {
            toWrite.add(s);
        }

        @Override
        public void run() {
            String s;
            try {
                while ((s = toWrite.take()) != null){
                    writer.write(s);
                }
            } catch (InterruptedException|IOException e) {
                // better to fail than fill memory
                throw new RuntimeException(e);
            }
        }
    }
}
