package com.feed_the_beast.javacurselib.websocket.messages.handler.tasks;

import com.feed_the_beast.javacurselib.websocket.messages.notifications.Response;

import javax.websocket.Session;

public interface Task {
    void execute(Session session, Response response);
}
