package com.feed_the_beast.javacurselib.service.contacts.contacts;

import com.feed_the_beast.javacurselib.common.enums.AccountType;
import com.feed_the_beast.javacurselib.common.enums.GroupRoleTag;

/**
 * representation of curse contact api GroupRoleNotification
 */
public class GroupRoleNotification {
    public int roleID;
    public String name;
    public int rank;
    public int vanityColor;
    public int vanityBadge;
    public boolean hasCustomVanityBadge;
    public boolean isDefault;
    public boolean isOwner;
    public GroupRoleTag tag;
    public AccountType source;
    public boolean isHidden;

}
