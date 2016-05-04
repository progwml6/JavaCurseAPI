package com.feed_the_beast.javacurselib.websocket.messages.response;

import com.feed_the_beast.javacurselib.JsonFactory;
import com.feed_the_beast.javacurselib.websocket.messages.ResponseParser;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.ConversationMessageNotification;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.HandshakeResponse;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.Response;
import com.feed_the_beast.javacurselib.websocket.messages.requests.ConversationMarkReadRequest;
import com.feed_the_beast.javacurselib.websocket.messages.requests.HandshakeRequest;
import com.feed_the_beast.javacurselib.websocket.messages.requests.JoinRequest;
import com.feed_the_beast.javacurselib.websocket.messages.requests.Request;
import org.junit.Test;
import static org.junit.Assert.*;

public class ResponseParserTest {
    static String handshakeString = "{\"TypeID\":-476754606,\"Body\":{\"Signal\":false}}";
    static String conversationMessageNotificationString = "{\"TypeID\":-635182161,\"Body\":{\"ClientID\":\"4f2f68a6-90fc-44ef-9278-4c76150f2be1\",\"ServerID\":\"afaa7607-c89f-4ebb-bb29-8c98dc885f4b\",\"ConversationID\":\"46a99533-2f0a-4bc0-bfb5-4621d904aed5\",\"ContactID\":\"46a99533-2f0a-4bc0-bfb5-4621d904aed5\",\"ConversationType\":1,\"RootConversationID\":\"a06020d9-40a4-4ff4-b167-8249ae54d4ef\",\"Timestamp\":1462283407754,\"SenderID\":13663374,\"SenderName\":\"jikuja\",\"SenderPermissions\":-1,\"SenderRoles\":[1],\"SenderVanityRole\":1,\"Mentions\":[],\"RecipientID\":0,\"Body\":\"kk\",\"IsDeleted\":false,\"DeletedTimestamp\":0,\"DeletedUserID\":0,\"DeletedUsername\":null,\"EditedTimestamp\":0,\"EditedUserID\":0,\"EditedUsername\":null,\"LikeCount\":0,\"LikeUserIDs\":[],\"LikeUsernames\":[],\"ContentTags\":[],\"Attachments\":[],\"NotificationType\":0}}";

    @Test
    public void handshakeResponse() {
        Response response = ResponseParser.stringToObject(handshakeString);
        assertSame(handshakeString, response.getOrigMessage());
        assertEquals(HandshakeResponse.class, response.getClass());
        assertFalse(((HandshakeResponse)response).signal);

        System.out.println(response.getClass());
        System.out.println(response.toJsonString());
    }

    @Test
    public void handshakeRequest() {
        HandshakeRequest request = HandshakeRequest.PING;
        assertEquals(HandshakeRequest.class, request.getClass());
        assertTrue(request.signal);
        assertEquals(-476754606, request.typeID);
        assertEquals(-476754606, request.getTypeID());
    }

    @Test
    public void markRead() {
        ConversationMarkReadRequest c = new ConversationMarkReadRequest();
        assertEquals(ConversationMarkReadRequest.class, c.getClass());
        assertEquals(-342895375, c.typeID);
        assertEquals(-342895375, c.getTypeID());
    }

    @Test
    public void conversationMessageNotification() {
        Response response = ResponseParser.stringToObject(conversationMessageNotificationString);
        assertNotNull(((ConversationMessageNotification)response).body);
    }
}
