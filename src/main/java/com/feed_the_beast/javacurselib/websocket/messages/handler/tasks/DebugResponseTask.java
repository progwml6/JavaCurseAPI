package com.feed_the_beast.javacurselib.websocket.messages.handler.tasks;


import com.feed_the_beast.javacurselib.websocket.messages.notifications.Response;

import javax.websocket.Session;
import java.util.logging.Logger;

public class DebugResponseTask implements ResponseTask {
    private static final Logger logger = Logger.getLogger(DebugResponseTask.class.getName());
    @Override
    public void execute(Session session, Response response) {
        logger.info(String.format("%s\n\t%s\n\t%s", response.getClass().getName(), response.getOrigMessage(), response.toString()));
    }
}