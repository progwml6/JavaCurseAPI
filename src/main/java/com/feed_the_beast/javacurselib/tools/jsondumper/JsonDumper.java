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

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;

public class JsonDumper {
    public static void main(String[] args) throws Exception {
        CountDownLatch latch = new CountDownLatch(1);
        RestUserEndpoints endpoints = new RestUserEndpoints();
        String s = new String(Files.readAllBytes(Paths.get(args[0])));
        LoginResponse lr = JsonFactory.GSON.fromJson(s, LoginResponse.class);
        // TODO: check if token requires renewal
        endpoints.setAuthToken(lr.session.token);
        endpoints.setupEndpoints();

        CompletableFuture<CreateSessionResponse> future = endpoints.session.create(new CreateSessionRequest(CurseGUID.newRandomUUID(), DevicePlatform.UNKNOWN));
        future.join();
        CreateSessionResponse sr = future.get();

        WebSocket ws = null;
        try {
            ws = new WebSocket(lr, sr, new URI(Apis.NOTIFICATIONS));
        } catch (Exception e) {
            System.exit(0);
        }

        String file = args[1];
        if (file != null && !file.isEmpty()) {
            ws.addRawTask(new JsonDiskWriter(file));
        }

        ws.addRequestTask(new TraceRequestTask());
        ws.addRawTask(new RawResponseLoggerTask());

        ws.start();
        latch.await();
    }
}
