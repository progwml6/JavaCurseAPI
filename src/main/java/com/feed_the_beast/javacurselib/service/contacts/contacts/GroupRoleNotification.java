package com.feed_the_beast.javacurselib.service.contacts.contacts;

import com.feed_the_beast.javacurselib.common.enums.AccountType;
import com.feed_the_beast.javacurselib.common.enums.GroupRoleTag;
import lombok.ToString;

/**
 * representation of curse contact api GroupRoleNotification
 */
@ToString
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
