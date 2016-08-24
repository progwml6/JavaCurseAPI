package com.feed_the_beast.javacurselib.websocket.messages.handler;

import com.feed_the_beast.javacurselib.websocket.WebSocket;
import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.RawTask;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.NotificationsServiceContractType;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.Response;
import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.Task;
import com.feed_the_beast.javacurselib.websocket.messages.requests.HandshakeRequest;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Nonnull;
import java.util.List;

@Slf4j
public class ResponseHandler {
    private Multimap<NotificationsServiceContractType, Task> handlers = ArrayListMultimap.create();
    private List<RawTask> rawHandlers = Lists.newArrayList();
    private List<Task> handlersForAllTypes = Lists.newArrayList();
    private WebSocket webSocket;

    public ResponseHandler(WebSocket webSocket) {
        this.webSocket = webSocket;
    }


    public void addTask(@Nonnull Task task, @Nonnull NotificationsServiceContractType type) {
        handlers.put(type, task);
    }

    public void addRawTask(@Nonnull RawTask task) {
        rawHandlers.add(task);
    }

    public void addTaskForAllTypes(@Nonnull Task task) {
        handlersForAllTypes.add(task);
    }

    public void executeInternalTasks(@Nonnull Response response) {
        if (response.getTypeID() == NotificationsServiceContractType.JOIN_RESPONSE) {
            webSocket.getRequestHandler().execute(HandshakeRequest.PING);
        } else if (response.getTypeID() == NotificationsServiceContractType.HANDSHAKE) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) { }
            webSocket.getRequestHandler().execute(HandshakeRequest.PING);
        }
    }

    public void executeRawTasks(@Nonnull String message) {
        for (RawTask t: rawHandlers) {
            t.execute(message);
        }
    }

    public void executeTasks(@Nonnull Response response) {
        for (Task t: handlersForAllTypes) {
            t.execute(webSocket, response);
        }

        for (Task t: handlers.get(response.getTypeID())) {
            t.execute(webSocket, response);
        }
    }
}