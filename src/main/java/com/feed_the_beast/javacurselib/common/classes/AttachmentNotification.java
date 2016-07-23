package com.feed_the_beast.javacurselib.common.classes;

import com.google.gson.annotations.SerializedName;

public class AttachmentNotification {
    @SerializedName("ID")
    public String id;
    public String conversationID;
    public String name;
    public String title;
    public int size;
    public String fileType;
    public String url;
    public int width;
    public int height;
    public boolean isAnimated;
    public boolean isEmbed;
    public int authorID;
    public String authorName;
    public long timestamp;
    public int regionID;
}
