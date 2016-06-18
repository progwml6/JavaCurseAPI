package com.feed_the_beast.javacurselib.websocket.messages.handler;

import com.feed_the_beast.javacurselib.websocket.WebSocket;
import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.RequestTask;
import com.feed_the_beast.javacurselib.websocket.messages.requests.Request;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Nonnull;
import javax.websocket.Session;
import java.io.IOException;
import java.util.List;

@Slf4j
public class RequestHandler {
    private Session session;
    private WebSocket webSocket;
    private List<RequestTask> handlers = Lists.newArrayList();

    public RequestHandler(WebSocket webSocket) {
        this.webSocket = webSocket;
    }

    public void addTask(RequestTask task) {
        handlers.add(task);
    }

    public void execute(@Nonnull Request request) {
        try {
            for (RequestTask t: handlers) {
                t.execute(request);
            }
            session.getBasicRemote().sendText(request.toJsonString());
        } catch (IOException|IllegalStateException e) {
            //TODO: still fails. Because we don't see a ping reply, we don't send a ping which means problem is not detected
            // Tyrus will notice problem and do onclose but slower then request fail detection
            log.warn("Error while sending message, reconnecting...", e);
            webSocket.stopPingThread();
            webSocket.start();
        }
    }

    public void setSession(Session session) {
        this.session = session;
    }
}