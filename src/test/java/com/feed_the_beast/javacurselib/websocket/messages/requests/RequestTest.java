package com.feed_the_beast.javacurselib.websocket.messages.requests;

import com.feed_the_beast.javacurselib.utils.CurseGUID;
import org.junit.Test;
import uk.co.datumedge.hamcrest.json.SameJSONAs;

import java.util.UUID;

import static org.junit.Assert.*;

public class RequestTest {
    static String handshakeString = "{\"TypeID\":-476754606,\"Body\":{\"Signal\":true}}";

    @Test
    public void joinRequest() {
        JoinRequest r = new JoinRequest(1234, CurseGUID.newInstance(new UUID(1, 0)), CurseGUID.newInstance(new UUID(0,1)));
    }

    @Test
    public void handshakeRequest() {
        HandshakeRequest r = HandshakeRequest.PING;
        assertTrue(r.signal);
        assertEquals(-476754606, r.getTypeID().getValue());
        assertThat(r.toJsonString(), SameJSONAs.sameJSONAs(handshakeString));
    }

}
