package com.feed_the_beast.javacurselib.service.contacts.contacts;

import com.feed_the_beast.javacurselib.utils.CurseGUID;
import com.google.gson.annotations.SerializedName;


/**
 * representation of curse contact api GroupEmoticonNotification
 */
public class GroupEmoticonNotification {
    public CurseGUID groupID;
    public String regexString;
    public String syncID;
    @SerializedName("URL")
    public String url;
    public int[] requiredRoles;
}
