package com.feed_the_beast.javacurselib.tools.jsondumper;


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

    @Override
    public void execute(@Nonnull String message) {
        jsonSaver.add(message);
    }

    private static class JsonSaver extends Thread {
        private  BlockingQueue<String> toWrite;
        private  BufferedWriter writer;

        public JsonSaver(File file) {
            try {
                this.toWrite = new LinkedBlockingQueue<>();
                this.writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
                this.setName("Json Entry Disk Writer");
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
                long i = 0;
                System.out.println("");
                while ((s = toWrite.take()) != null){
                    i++;
                    writer.write(s);
                    if (i % 10 == 0) {
                        System.out.print(".");
                    } else if (i % 1000 == 0) {
                        System.out.println(i + " messages written");
                    }
                }
            } catch (InterruptedException|IOException e) {
                // better to fail than fill memory
                throw new RuntimeException(e);
            }
        }
    }
}
