package com.feed_the_beast.javacurselib.websocket.messages.notifications;

public class ConversationMessageNotification extends BaseResponse implements Response {
    public String ClientID;
    public String ServerID;
    public String ConversationID;
    public String ContactID;
    //ConversationType: Curse_Friends_Enums.ConversationType;
    public String RootConversationID;
    public int Timestamp;
    public int SenderID;
    public String SenderName;
    public int SenderPermissions;
    public int[] SenderRoles;
    public int SenderVanityRole;
    public int[] Mentions;
    public int RecipientID;
    public String Body;
    boolean IsDeleted;
    public int DeletedTimestamp;
    public int DeletedUserID;
    public String DeletedUsername;
    public int EditedTimestamp;
    public int EditedUserID;
    public String EditedUsername;
    public int LikeCount;
    public int[] LikeUserIDs;
    public String[] LikeUsernames;
    public int[] ContentTags;
    //Attachments: AttachmentNotification[];
    int NotificationType;  // TODO: enum: NotificationType: Curse_Friends_Enums.ConversationNotificationType;

    @Override
    public String toString() {
        return String.format("msg: %s: %s", (Body==null ? null : SenderName), (Body==null ? null : Body));
    }
}
