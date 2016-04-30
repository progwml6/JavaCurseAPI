package com.feed_the_beast.javacurselib.websocket;

import com.feed_the_beast.javacurselib.service.logins.login.LoginResponse;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionResponse;
import com.feed_the_beast.javacurselib.websocket.messages.handler.ResponseHandler;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.*;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.HandshakeResponse;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.JoinResponse;
import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.*;

import javax.websocket.*;
import java.net.URI;
import java.util.concurrent.CountDownLatch;

public class WebSocketStarter {
    public static ResponseHandler responseHandler = new ResponseHandler();

    public static void start(LoginResponse loginResponse, CreateSessionResponse sessionResponse, String endpoint) {
        CountDownLatch latch = new CountDownLatch(1);


        WebSocketContainer client = ContainerProvider.getWebSocketContainer();
        ClientEndpointConfig cec = ClientEndpointConfig.Builder.create().configurator(new NotificationsEndPointConfigurator(loginResponse)).build();
        setupResponseHandler(responseHandler);
        NotificationsEndPoint notificationsEndPoint = new NotificationsEndPoint(loginResponse, sessionResponse, endpoint, responseHandler);

        try {
            Session s = client.connectToServer(notificationsEndPoint, null, new URI(endpoint));
            latch.await();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void setupResponseHandler(ResponseHandler responseHandler) {
        responseHandler.addTask(new DebugResponseTask(), -2, ConversationMessageNotification.class);
        responseHandler.addTask(new JoinResponseTask(), 0, JoinResponse.class);
        responseHandler.addTask(new HandshakeResponseTask(), 0, HandshakeResponse.class);
        responseHandler.addTask(new DefaultResponseTask(), -2, UnknownResponse.class);
    }
}
