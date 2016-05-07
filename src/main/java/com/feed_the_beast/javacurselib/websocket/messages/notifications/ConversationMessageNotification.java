package com.feed_the_beast.javacurselib.websocket.messages.notifications;

import com.feed_the_beast.javacurselib.service.conversations.conversations.AttachmentNotification;
import com.feed_the_beast.javacurselib.service.conversations.conversations.ConversationNotificationType;
import com.feed_the_beast.javacurselib.service.conversations.conversations.ConversationType;

import java.util.List;

public class ConversationMessageNotification extends BaseResponse implements Response {
    public String clientID;
    public String serverID;
    public String conversationID;
    public String contactID;
    public ConversationType conversationType;
    public String rootConversationID;
    public long timestamp;
    public long senderID;
    public String senderName;
    public int senderPermissions;
    public int[] senderRoles;
    public int senderVanityRole;
    public int[] mentions;
    public int recipientID;
    public String body;
    boolean isDeleted;
    public int deletedTimestamp;
    public int deletedUserID;
    public String deletedUsername;
    public int editedTimestamp;
    public int editedUserID;
    public String editedUsername;
    public int likeCount;
    public int[] likeUserIDs;
    public String[] likeUsernames;
    public int[] contentTags;
    public List<AttachmentNotification> attachments;
    public ConversationNotificationType notificationType;

    @Override
    public String toString() {
        return String.format("msg: %s: %s", (body==null ? null : senderName), (body==null ? null : body));
    }
}
