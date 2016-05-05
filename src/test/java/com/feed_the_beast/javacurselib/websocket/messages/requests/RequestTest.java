package com.feed_the_beast.javacurselib.websocket.messages.requests;

import org.junit.Ignore;
import org.junit.Test;
import uk.co.datumedge.hamcrest.json.SameJSONAs;

import java.util.UUID;

import static org.junit.Assert.*;

public class RequestTest {
    static String handshakeString = "{\"TypeID\":-476754606,\"Body\":{\"Signal\":true}}";

    @Test
    public void joinRequest() {
        JoinRequest r = new JoinRequest(1234, new UUID(1, 0), new UUID(0,1));
        System.out.println(r.toJsonString());
    }

    @Test
    public void handshakeRequest() {
        HandshakeRequest r = HandshakeRequest.PING;
        assertTrue(r.signal);
        assertEquals(-476754606, r.getTypeID().getValue());
        assertThat(r.toJsonString(), SameJSONAs.sameJSONAs(handshakeString));
    }

    @Test
    public void messageRequest() {
        Request r = new ConversationMessageRequest(UUID.randomUUID(), "Test messsage");
        String json = r.toJsonString();
        assertTrue(json.contains("AttachmentID"));
        assertTrue(json.contains("00000000-0000-0000-0000-000000000000"));
    }

    @Test
    public void messageMarkReadRequest0() {
        ConversationMarkReadRequest r = new ConversationMarkReadRequest(new UUID(0,0));
        assertEquals(ConversationMarkReadRequest.class, r.getClass());
        assertEquals(-342895375, r.getTypeID().getValue());
    }
}