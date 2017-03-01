package com.feed_the_beast.javacurselib.websocket;

import com.feed_the_beast.javacurselib.service.logins.login.LoginResponse;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionResponse;
import com.feed_the_beast.javacurselib.websocket.messages.handler.RequestHandler;
import com.feed_the_beast.javacurselib.websocket.messages.handler.ResponseHandler;
import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.RawTask;
import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.RequestTask;
import com.feed_the_beast.javacurselib.websocket.messages.handler.tasks.Task;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.NotificationsServiceContractType;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.URI;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.annotation.Nonnull;
import javax.websocket.ContainerProvider;
import javax.websocket.DeploymentException;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;

// TODO: split public functions into separated class. Hint: hide implementation behind facade
//
@Slf4j
public class WebSocket {
    private final ResponseHandler responseHandler;
    private final RequestHandler requestHandler;

    private CreateSessionResponse sessionResponse;
    private URI endpoint;

    private Session session;
    private WebSocketContainer client = ContainerProvider.getWebSocketContainer();
    private NotificationsEndPoint notificationsEndPoint;    //TODO: make configurable?
    @Getter private boolean reconnect = true;
    @Getter private AtomicBoolean connecting = new AtomicBoolean(false);

    // API public
    @Deprecated //use WebSocket(@Nonnull CreateSessionResponse sessionResponse, @Nonnull URI endpoint)
    public WebSocket (@Nonnull LoginResponse loginResponse, @Nonnull CreateSessionResponse sessionResponse, @Nonnull URI endpoint) {
        this(sessionResponse, endpoint);
    }

    public WebSocket (@Nonnull CreateSessionResponse sessionResponse, @Nonnull URI endpoint) {
        this.sessionResponse = sessionResponse;
        this.endpoint = endpoint;

        responseHandler = new ResponseHandler(this);
        requestHandler = new RequestHandler(this);
    }

    // API public
    public void start () {
        connecting.set(true);
        boolean connected = false;
        while (!connected) {
            try {
                notificationsEndPoint = new NotificationsEndPoint(sessionResponse, this);
                // blocks, rest of connection initialization is done in NotificationsEndPoint#onOpen()
                session = client.connectToServer(notificationsEndPoint, null, endpoint);
                connected = true;
                connecting.set(false);
            } catch (IOException | DeploymentException e) {
                log.error("failed", e);
            }
            if (!connected) {
                log.info("Reconnecting... (5 seconds)");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void stop () {
        reconnect = false;

        try {
            if (session.isOpen()) {
                session.close();
            }
        } catch (IOException e) {
            log.warn("failed", e);
        }
        // free memory
        session = null;
    }

    // API private
    public ResponseHandler getResponseHandler () {
        return responseHandler;
    }

    // API private
    public RequestHandler getRequestHandler () {
        return requestHandler;
    }

    private Session getSession () {
        return session;
    }

    ///////////////////////////
    // API public response/notification handler methods
    ///////////////////////////

    /**
     * Adds task handler. Used to execute actions for server Respoinses/Notifications
     * @param task Task to add
     * @param type Type for added task
     */
    public void addTask (@Nonnull Task task, @Nonnull NotificationsServiceContractType type) {
        responseHandler.addTask(task, type);
    }

    /**
     * Adds task handler. Used to execute actions for server Respoinses/Notifications
     * @param task Task to add
     * @param types Types for added task
     */
    public void addTask (@Nonnull Task task, @Nonnull NotificationsServiceContractType... types) {
        for (NotificationsServiceContractType type : types) {
            responseHandler.addTask(task, type);
        }
    }

    /**
     * Adds task handler for all types. Used to execute actions for server Respoinses/Notifications
     * @param task Task to add
     */
    public void addTaskForAllTypes (@Nonnull Task task) {
        responseHandler.addTaskForAllTypes(task);
    }

    public void addRawTask (@Nonnull RawTask task) {
        responseHandler.addRawTask(task);
    }

    public void addRequestTask (@Nonnull RequestTask task) {
        requestHandler.addTask(task);
    }
}