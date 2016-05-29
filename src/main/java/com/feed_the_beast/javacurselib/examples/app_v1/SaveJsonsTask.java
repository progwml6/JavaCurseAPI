package com.feed_the_beast.javacurselib.examples.app_v1;

import com.feed_the_beast.javacurselib.websocket.WebSocket;
import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.Task;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.Response;

import javax.annotation.Nonnull;
import java.io.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Logger;

public class SaveJsonsTask implements Task {
    private static final Logger logger = Logger.getLogger(SaveJsonsTask.class.getName());
    private final JsonSaver jsonSaver;

    public SaveJsonsTask(File file) {
        this.jsonSaver = new JsonSaver(file);
        this.jsonSaver.run();
    }

    public SaveJsonsTask(String file) {
        this(new File(file));
    }

    @Override
    public void execute(@Nonnull WebSocket webSocket, @Nonnull Response response) {
        jsonSaver.add(response.getOrigMessage());
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
