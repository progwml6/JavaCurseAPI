package com.feed_the_beast.javacurselib.websocket.messages.response;

import com.feed_the_beast.javacurselib.websocket.messages.requests.ConversationMarkReadRequest;
import com.feed_the_beast.javacurselib.websocket.messages.requests.ConversationMessageRequest;
import com.feed_the_beast.javacurselib.websocket.messages.requests.HandshakeRequest;
import com.feed_the_beast.javacurselib.websocket.messages.requests.Request;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jikuja on 5.5.2016.
 */
public class RequestTest {
    @Test
    public void handshakeRequest() {
        HandshakeRequest request = HandshakeRequest.PING;
        assertEquals(HandshakeRequest.class, request.getClass());
        assertTrue(request.signal);
        assertEquals(-476754606, request.getTypeID().getValue());
    }

    @Test
    public void markRead() {
        ConversationMarkReadRequest c = new ConversationMarkReadRequest();
        assertEquals(ConversationMarkReadRequest.class, c.getClass());
        assertEquals(-342895375, c.getTypeID().getValue());
    }

    @Ignore // fix AttachmentID. Should use UUID
    @Test
    public void messageRequest() {
        Request r = new ConversationMessageRequest();
        String json = r.toJsonString();
        assertTrue(json.contains("AttachmentID"));
        assertTrue(json.contains("00000000-0000-0000-0000-000000000000"));
    }
}
