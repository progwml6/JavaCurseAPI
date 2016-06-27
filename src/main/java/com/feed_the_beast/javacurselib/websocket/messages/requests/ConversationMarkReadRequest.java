package com.feed_the_beast.javacurselib.websocket.messages.requests;

import com.feed_the_beast.javacurselib.utils.CurseGUID;

import javax.annotation.Nonnull;
import java.util.Date;
/**
 * Mark conversation as read. Curse servers send similar {@code ConversationReadNotification} to all user's clients
 * <p>
 * <h1>Notes of RI behaviour:</h1>
 *   <ul>
 *     <li> Automatically sent {@code ConversationMarkReadRequest}s include {@code timestamp}s </li>
 *     <li> Manual mark as read sends multiple {@code ConversationMarkReadRequest}s with null timespamps </li>
 *   </ul>
 * <p>
 * TODO: check and configure null timestamp handling
 */
public class ConversationMarkReadRequest extends BaseRequest implements Request {
    /**
     * Conversation(group or PM) to be marked as read
     */
    public CurseGUID conversationID;
    /**
     * Usually current current time or null.
     *
     * @see ConversationMarkReadRequest
     */
    public Date timestamp;

    public ConversationMarkReadRequest(@Nonnull CurseGUID conversationID) {
        this.conversationID = conversationID;
        this.timestamp = new Date(); //
    }

    @Override
    public RequestsServiceContractType getTypeID() {
        return RequestsServiceContractType.CONVERSATION_MARK_READ_REQUEST;
    }
}
