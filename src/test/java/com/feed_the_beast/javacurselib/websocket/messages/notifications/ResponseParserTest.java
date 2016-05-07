package com.feed_the_beast.javacurselib.websocket.messages.notifications;


import com.feed_the_beast.javacurselib.websocket.JsonFactory;
import org.junit.Ignore;
import org.junit.Test;
import uk.co.datumedge.hamcrest.json.SameJSONAs;

import static org.junit.Assert.*;

public class ResponseParserTest {
    static String handshakeString = "{\"TypeID\":-476754606,\"Body\":{\"Signal\":false}}";
    static String conversationMessageNotificationString = "{\"TypeID\":-635182161,\"Body\":{\"ClientID\":\"4f2f68a6-90fc-44ef-9278-4c76150f2be1\",\"ServerID\":\"afaa7607-c89f-4ebb-bb29-8c98dc885f4b\",\"ConversationID\":\"46a99533-2f0a-4bc0-bfb5-4621d904aed5\",\"ContactID\":\"46a99533-2f0a-4bc0-bfb5-4621d904aed5\",\"ConversationType\":1,\"RootConversationID\":\"a06020d9-40a4-4ff4-b167-8249ae54d4ef\",\"Timestamp\":1462283407754,\"SenderID\":13663374,\"SenderName\":\"jikuja\",\"SenderPermissions\":-1,\"SenderRoles\":[1],\"SenderVanityRole\":1,\"Mentions\":[],\"RecipientID\":0,\"Body\":\"kk\",\"IsDeleted\":false,\"DeletedTimestamp\":0,\"DeletedUserID\":0,\"DeletedUsername\":null,\"EditedTimestamp\":0,\"EditedUserID\":0,\"EditedUsername\":null,\"LikeCount\":0,\"LikeUserIDs\":[],\"LikeUsernames\":[],\"ContentTags\":[],\"Attachments\":[],\"NotificationType\":0}}";
    static String unknownResponseString = "{\"TypeID\":-666666666,\"Body\":{\"ClientID\":\"4f2f68a6-90fc-44ef-9278-4c76150f2be1\",\"ServerID\":\"afaa7607-c89f-4ebb-bb29-8c98dc885f4b\",\"ConversationID\":\"46a99533-2f0a-4bc0-bfb5-4621d904aed5\",\"ContactID\":\"46a99533-2f0a-4bc0-bfb5-4621d904aed5\",\"ConversationType\":1,\"RootConversationID\":\"a06020d9-40a4-4ff4-b167-8249ae54d4ef\",\"Timestamp\":1462283407754,\"SenderID\":13663374,\"SenderName\":\"jikuja\",\"SenderPermissions\":-1,\"SenderRoles\":[1],\"SenderVanityRole\":1,\"Mentions\":[],\"RecipientID\":0,\"Body\":\"kk\",\"IsDeleted\":false,\"DeletedTimestamp\":0,\"DeletedUserID\":0,\"DeletedUsername\":null,\"EditedTimestamp\":0,\"EditedUserID\":0,\"EditedUsername\":null,\"LikeCount\":0,\"LikeUserIDs\":[],\"LikeUsernames\":[],\"ContentTags\":[],\"Attachments\":[],\"NotificationType\":0}}";
    static String markRead = "{\"TypeID\":-695526586,\"Body\":{\"GroupID\":\"00000000-0000-0000-0000-000000000000\",\"FriendID\":0,\"Timestamp\":\"0001-01-01T00:00:00Z\",\"ConversationID\":\"8d45eb7f-6392-4ea4-a15f-bd3faac9381a\"}}";

    @Test
    public void handshakeResponse() {
        Response response = JsonFactory.stringToResponse(handshakeString);
        assertSame(handshakeString, response.getOrigMessage());
        assertEquals(HandshakeResponse.class, response.getClass());
        assertFalse(((HandshakeResponse)response).signal);
    }

    @Test
    public void handshakeResponsePedantic() {
        Response response = JsonFactory.stringToResponse(handshakeString);
        assertThat(response.toJsonString(), SameJSONAs.sameJSONAs(handshakeString));
    }

    @Test
    public void conversationMessageNotification() {
        Response response = JsonFactory.stringToResponse(conversationMessageNotificationString);
        //TODO
    }

    @Ignore // Add missing fields
    @Test
    public void conversationMessageNotificationPedantic() {
        Response response = JsonFactory.stringToResponse(conversationMessageNotificationString);
        assertThat(response.toJsonString(), SameJSONAs.sameJSONAs(conversationMessageNotificationString));
    }

    @Test
    public void markRead() {
        Response response = JsonFactory.stringToResponse(markRead);
    }

    @Test
    @Ignore // Timestamp fails
    public void markReadPedantic() {
        Response response = JsonFactory.stringToResponse(markRead);
        assertThat(response.toJsonString(), SameJSONAs.sameJSONAs(markRead));
    }

    @Test
    public void unknownResponseCreation() {
        Response response = JsonFactory.stringToResponse(unknownResponseString);
        assertSame(unknownResponseString, response.getOrigMessage());
        assertEquals(UnknownResponse.class, response.getClass());
        assertEquals(NotificationsServiceContractType.UNKNOWN, response.getTypeID());
    }
}
