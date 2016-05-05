package com.feed_the_beast.javacurselib.websocket.messages.handler.tasks;

import com.feed_the_beast.javacurselib.websocket.messages.notifications.Response;

import javax.websocket.Session;

public interface  Task<T extends Response> {
    void execute(Session session, T response);
}
