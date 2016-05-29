package com.feed_the_beast.javacurselib.websocket;

import java.io.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Logger;

public class JsonDiskWriter {
    private static final Logger logger = Logger.getLogger(JsonDiskWriter.class.getName());
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
