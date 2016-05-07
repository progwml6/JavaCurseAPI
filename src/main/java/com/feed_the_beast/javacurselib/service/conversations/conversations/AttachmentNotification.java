package com.feed_the_beast.javacurselib.service.conversations.conversations;

import com.google.gson.annotations.SerializedName;

public class AttachmentNotification {
    @SerializedName("ID")
    public String id;
    public String conversationID;
    public String name;
    public String title;
    public int size;
    public String FileType;
    public String url;
    public int width;
    public int height;
    public boolean isAnimated;
    public boolean isEmbed;
    public int AuthorID;
    public String AuthorName;
    public long timestamp;
}
