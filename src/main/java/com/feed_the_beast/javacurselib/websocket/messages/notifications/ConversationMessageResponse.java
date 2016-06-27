package com.feed_the_beast.javacurselib.websocket.messages.notifications;

import com.feed_the_beast.javacurselib.websocket.messages.notifications.enums.DeliveryStatus;
import lombok.ToString;

/**
 * Response from server for sent message
 * <p>
 * Server sends this message after when messsage is processed. {@code conversationID} and {@code clientID} are copied
 * from original {@link com.feed_the_beast.javacurselib.websocket.messages.requests.ConversationMessageRequest} instance.
 * {@code serverID} is UUID created by server.
 */
@ToString
public class ConversationMessageResponse extends BaseResponse implements Response {
    public String conversationID;
    public DeliveryStatus status;
    public String clientID;
    public String serverID;
}
