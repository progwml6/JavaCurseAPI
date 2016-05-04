package com.feed_the_beast.javacurselib.service.contacts.contacts;

import com.google.gson.annotations.SerializedName;

import java.util.UUID;

/**
 * representation of curse contact api GroupEmoticonNotification
 */
public class GroupEmoticonNotification {
    public UUID groupID;
    public String regexString;
    public String syncID;
    @SerializedName("URL")
    public String url;
    public int[] requiredRoles;
}
