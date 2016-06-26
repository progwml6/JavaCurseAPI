package com.feed_the_beast.javacurselib.tools.jsondumper;

import com.feed_the_beast.javacurselib.common.enums.DevicePlatform;
import com.feed_the_beast.javacurselib.data.Apis;
import com.feed_the_beast.javacurselib.data.JsonFactory;
import com.feed_the_beast.javacurselib.examples.app_v1.RawResponseLoggerTask;
import com.feed_the_beast.javacurselib.examples.app_v1.TraceRequestTask;
import com.feed_the_beast.javacurselib.rest.RestUserEndpoints;
import com.feed_the_beast.javacurselib.service.logins.login.LoginResponse;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionRequest;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionResponse;
import com.feed_the_beast.javacurselib.utils.CurseGUID;
import com.feed_the_beast.javacurselib.websocket.WebSocket;
import lombok.extern.slf4j.Slf4j;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;

@Slf4j
public class JsonDumper {
    /**
     *
     * @param args First argument: path to LoginResponse. Second argument: path to dump file
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        String s = new String(Files.readAllBytes(Paths.get(args[0])));
        LoginResponse lr = JsonFactory.GSON.fromJson(s, LoginResponse.class);

        // start creating REST endpoints
        RestUserEndpoints endpoints = new RestUserEndpoints();
        endpoints.setAuthToken(lr.session.token);
        endpoints.setupEndpoints();

        // TODO: check if token need refresh

        // start new session
        CompletableFuture<CreateSessionResponse> future = endpoints.session.create(new CreateSessionRequest(CurseGUID.newRandomUUID(), DevicePlatform.UNKNOWN));
        CreateSessionResponse sr = future.get();

        // Create websocket
        WebSocket ws = null;
        try {
            ws = new WebSocket(lr, sr, new URI(Apis.NOTIFICATIONS));
        } catch (Exception e) {
            log.error("failed", e);
            System.exit(0);
        }

        // Second argument is file to save raw JSON messages
        String file = args[1];
        if (file != null && !file.isEmpty()) {
            ws.addRawTask(new JsonDiskWriter(file));
        } else {
            log.warn("No filename given or empty filename. Continuing but not saving raw messages");
        }

        // Log everything. Built-in logger tasks
        // use trace logging level
        ws.addRequestTask(new TraceRequestTask());
        ws.addRawTask(new RawResponseLoggerTask());

        ws.start();
    }
}
