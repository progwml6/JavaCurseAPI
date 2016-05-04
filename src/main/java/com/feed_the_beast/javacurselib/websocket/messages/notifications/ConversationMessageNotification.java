package com.feed_the_beast.javacurselib.websocket.messages.notifications;

public class ConversationMessageNotification extends BaseResponse implements Response {
    public String clientID;
    public String serverID;
    public String conversationID;
    public String contactID;
    //ConversationType: Curse_Friends_Enums.ConversationType;
    public String rootConversationID;
    public int timestamp;
    public int senderID;
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
    //Attachments: AttachmentNotification[];
    int notificationType;  // TODO: enum: NotificationType: Curse_Friends_Enums.ConversationNotificationType;

    @Override
    public String toString() {
        return String.format("msg: %s: %s", (body==null ? null : senderName), (body==null ? null : body));
    }
}
