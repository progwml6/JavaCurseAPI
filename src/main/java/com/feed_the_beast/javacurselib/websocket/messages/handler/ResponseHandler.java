package com.feed_the_beast.javacurselib.websocket.messages.handler;

import com.feed_the_beast.javacurselib.websocket.messages.notifications.BaseResponse;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.Response;
import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.ResponseTask;
import com.google.common.collect.Lists;

import javax.websocket.Session;
import java.util.List;


public class ResponseHandler {
    static List<Integer> priorities = Lists.newArrayList(-2, -1, 0, 1, 2);
    List<ResponseTaskContainer> containers = Lists.newArrayList();

    public void addTask(ResponseTask task, int priority, Class<? extends BaseResponse> clazz) {
        //check args
        containers.add(new ResponseTaskContainer(task, priority, clazz));
    }

    public void executeTasks(Response response, Session session) {
        for (int i : priorities) {
            for (ResponseTaskContainer c : containers) {
                if (c.priority == i) {
                    if (response.getClass() == c.clazz) {
                        c.task.execute(session, response);
                    }
                }
            }
        }
    }

    static class ResponseTaskContainer {
        ResponseTask task;
        int priority;
        Class clazz;

        public ResponseTaskContainer(ResponseTask r, int p, Class<? extends BaseResponse> clazz) {
            task = r;
            priority = p;
            this.clazz = clazz;
        }
    }
}
