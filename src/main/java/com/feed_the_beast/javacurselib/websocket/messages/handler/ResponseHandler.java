package com.feed_the_beast.javacurselib.websocket.messages.handler;

import com.feed_the_beast.javacurselib.websocket.WebSocket;
import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.internal.HandshakeResponseTask;
import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.internal.JoinResponseTask;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.NotificationsServiceContractType;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.Response;
import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.Task;
import com.google.common.collect.Lists;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.logging.Logger;


public class ResponseHandler {
    private static final Logger logger = Logger.getLogger(ResponseHandler.class.getName());
    private List<ResponseTaskContainer> containers = Lists.newArrayList();

    public void setWebSocket(@Nonnull WebSocket webSocket) {
        this.webSocket = webSocket;
    }
    private WebSocket webSocket;
    // TODO: remove internal handlers if ...
    //private HandshakeResponseTask handshakeResponseTask = new HandshakeResponseTask();
    //private JoinResponseTask joinResponseTask = new JoinResponseTask();

    public void addTask(@Nonnull Task task, @Nonnull NotificationsServiceContractType type) {
        containers.add(new ResponseTaskContainer(task, type));
    }

    public boolean executeInternalTasks(@Nonnull Response response) {
        if (response.getTypeID() == NotificationsServiceContractType.JOIN_RESPONSE) {
            logger.info("Got JoinResponse: " + response);
            logger.info(response.getOrigMessage());

            //joinResponseTask.execute(webSocket.getRequestHandler(), response);
            webSocket.startPingThread();
            return false;
        } else if (response.getTypeID() == NotificationsServiceContractType.HANDSHAKE) {
            //handshakeResponseTask.execute(webSocket.getRequestHandler(), response);
            return false;
        }
        return true;
    }

    public void executeTasks(@Nonnull Response response) {
        for (ResponseTaskContainer c : containers) {
            if (response.getTypeID() == c.type) {
                c.task.execute(webSocket, response);
            }
        }
    }

    private static class ResponseTaskContainer {
        Task task;
        NotificationsServiceContractType type;

        public ResponseTaskContainer(Task r, NotificationsServiceContractType type) {
            task = r;
            this.type = type;
        }
    }
}
