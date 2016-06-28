package com.feed_the_beast.javacurselib.service.contacts.contacts;


import com.feed_the_beast.javacurselib.common.classes.ExternalCommunityPublicContract;
import com.feed_the_beast.javacurselib.common.classes.GroupMemberContract;
import com.feed_the_beast.javacurselib.common.enums.*;
import com.feed_the_beast.javacurselib.utils.CurseGUID;
import lombok.ToString;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * representation of curse contacts api GroupNotification
 */
@ToString
public class GroupNotification {
    public String groupTitle;
    public CurseGUID groupID;
    public CurseGUID parentGroupID;
    public CurseGUID rootGroupID;
    public String voiceSessionCode;
    public String messageOfTheDay;
    public GroupType groupType;
    public GroupSubType groupSubType;
    public int displayOrder;
    public boolean metaDataOnly;
    public boolean allowTemporaryChildGroups;
    public boolean forcePushToTalk;
    public GroupStatus status;
    public boolean isDefaultChannel;
    public List<GroupRoleNotification> roles;   // null in ContactsResponse
    public Map<Integer,Set<GroupPermissions>> rolePermissions;
    public GroupMembershipNotification membership;
    public int memberCount;
    public List<GroupEmoticonNotification> emotes; // null in ContactsResponse
    public List<GroupMemberContract> members; // TODO: null in both, check. According to documention only present for small groups
    public List<ChannelContract> channels;
    public GroupMode groupMode;
    public boolean isPublic;
    public String urlPath;
    public String urlHost;
    public boolean chatThrottleEnabled;
    public int chatThrottleSeconds;
    public boolean isStreaming;
    public List<ExternalCommunityPublicContract> linkedCommunities; // null in ContactsResponse
    public int afkTimerMins;

    public int getRoleIdbyName(String s) {
        for (GroupRoleNotification role: roles) {
            if (role.name.equals(s)) {
                return role.roleID;
            }
        }
        throw new IllegalStateException("No role found: " + s);
    }

    public String getRoleNamebyId(int id) {
        for (GroupRoleNotification role: roles) {
            if (role.roleID == id) {
                return role.name;
            }
        }
        throw new IllegalStateException("No role found: " + id);
    }

    public String getChannelNamebyId(CurseGUID id) {
        for (ChannelContract c : channels) {
            if (c.groupID == id) {
                return c.groupTitle;
            }
        }
        return null;
    }

    public CurseGUID getChannelIdByName(String s) {
        for (ChannelContract c : channels) {
            if (c.groupTitle.equals(s)) {
                return c.groupID;
            }
        }
        return null;
    }
}
