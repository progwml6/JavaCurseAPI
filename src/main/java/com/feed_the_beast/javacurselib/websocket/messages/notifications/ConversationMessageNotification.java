package com.feed_the_beast.javacurselib.websocket.messages.notifications;

import com.feed_the_beast.javacurselib.common.enums.GroupPermissions;
import com.feed_the_beast.javacurselib.utils.CurseGUID;
import com.feed_the_beast.javacurselib.common.classes.AttachmentNotification;
import com.feed_the_beast.javacurselib.common.enums.ConversationNotificationType;
import com.feed_the_beast.javacurselib.common.enums.ConversationType;
import lombok.ToString;

import java.util.List;
import java.util.Set;

@ToString
public class ConversationMessageNotification extends BaseResponse implements Response {
    public String clientID;
    public CurseGUID serverID;
    public CurseGUID conversationID;
    public CurseGUID contactID;
    public ConversationType conversationType;
    public CurseGUID rootConversationID;
    public long timestamp;
    public long senderID;
    public String senderName;
    public Set<GroupPermissions> senderPermissions;
    public int[] senderRoles;
    public int senderVanityRole;
    public int[] mentions;
    public int recipientID;
    public String body;
    public boolean isDeleted;
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
}
