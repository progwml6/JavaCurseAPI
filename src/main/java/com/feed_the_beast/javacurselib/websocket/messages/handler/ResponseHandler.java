package com.feed_the_beast.javacurselib.websocket.messages.handler;

import com.feed_the_beast.javacurselib.websocket.messages.notifications.NotificationsServiceContractType;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.Response;
import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.Task;
import com.google.common.collect.Lists;

import javax.annotation.Nonnull;
import javax.websocket.Session;
import java.util.List;


public class ResponseHandler {
    List<ResponseTaskContainer> containers = Lists.newArrayList();

    public void addTask(@Nonnull Task task, @Nonnull NotificationsServiceContractType type) {
        containers.add(new ResponseTaskContainer(task, type));
    }

    public void executeTasks(Response response, Session session) {
        for (ResponseTaskContainer c : containers) {
            if (response.getTypeID() == c.type) {
                c.task.execute(session, response);
            }
        }
    }

    static class ResponseTaskContainer {
        Task task;
        NotificationsServiceContractType type;

        public ResponseTaskContainer(Task r, NotificationsServiceContractType type) {
            task = r;
            this.type = type;
        }
    }
}
