package com.feed_the_beast.javacurselib.tools;

import com.feed_the_beast.javacurselib.common.enums.DevicePlatform;
import com.feed_the_beast.javacurselib.data.Apis;
import com.feed_the_beast.javacurselib.examples.app_v1.RawRequestLoggerTask;
import com.feed_the_beast.javacurselib.examples.app_v1.RawResponseLoggerTask;
import com.feed_the_beast.javacurselib.rest.RestUserEndpoints;
import com.feed_the_beast.javacurselib.service.contacts.contacts.ContactsResponse;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionRequest;
import com.feed_the_beast.javacurselib.service.sessions.sessions.CreateSessionResponse;
import com.feed_the_beast.javacurselib.utils.CurseGUID;
import com.feed_the_beast.javacurselib.websocket.WebSocket;
import com.google.common.collect.Sets;
import lombok.extern.slf4j.Slf4j;

import java.net.URI;
import java.util.Set;

@Slf4j
public class DebugWebSocket {
    private static ContactsResponse contacts;
    private static CreateSessionResponse session;

    // ignore spammy messages
    private static final Set<String> ignores = Sets.newHashSet("(?s).*TypeID\"\\s*:\\s*1260535191.*", "(?s).*TypeID\"\\s*:\\s*-476754606.*");

    public static void main(String[] args) throws Exception {
        log.info("Debug websocket");
        RestUserEndpoints endpoints = Tool.init(false); // no we don't want REST debugging

        contacts = endpoints.contacts.get().get();
        session = endpoints.session.create(new CreateSessionRequest(CurseGUID.newRandomUUID(), DevicePlatform.UNKNOWN)).get();

        WebSocket webSocket = new WebSocket(Tool.lr, session, new URI(Apis.NOTIFICATIONS));
        if (args.length > 0 && args[0].equals("all")) {
            webSocket.addRawTask(new RawResponseLoggerTask());
            webSocket.addRequestTask(new RawRequestLoggerTask());
        } else {
            webSocket.addRawTask(new RawResponseLoggerTask(ignores));
            webSocket.addRequestTask(new RawRequestLoggerTask(ignores));
        }
        webSocket.start();
    }
}