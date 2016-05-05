package com.feed_the_beast.javacurselib.examples.app_v1;


import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.Task;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.Response;

import javax.websocket.Session;
import java.util.logging.Logger;

public class DefaultResponseTask implements Task {
    private static final Logger logger = Logger.getLogger(DefaultResponseTask.class.getName());
    @Override
    public void execute(Session session, Response response) {
        logger.info(response.getClass().getSimpleName() + " : " + response.getOrigMessage());
    }
}
