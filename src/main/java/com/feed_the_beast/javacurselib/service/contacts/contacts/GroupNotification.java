package com.feed_the_beast.javacurselib.service.contacts.contacts;


import com.feed_the_beast.javacurselib.common.classes.ExternalCommunityPublicContract;
import com.feed_the_beast.javacurselib.common.classes.GroupMemberContract;
import com.feed_the_beast.javacurselib.common.enums.*;
import com.feed_the_beast.javacurselib.service.groups.groups.GroupMemberSearchRequest;
import com.feed_the_beast.javacurselib.utils.CurseGUID;
import lombok.ToString;

import javax.annotation.Nonnull;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiFunction;

/**
 * Representation of curse contacts api GroupNotification
 */
@ToString
public class GroupNotification {
    public String groupTitle;
    public CurseGUID groupID;
    public long homeRegionID;
    public String homeRegionKey;
    public CurseGUID parentGroupID;
    public CurseGUID rootGroupID;
    public String voiceSessionCode;
    public String messageOfTheDay;
    public GroupType groupType;
    public GroupSubType groupSubtype;
    public int displayOrder;
    public boolean metaDataOnly;
    public boolean allowTemporaryChildGroups;
    public boolean forcePushToTalk;
    public GroupStatus status;
    public boolean isDefaultChannel;
    /**
     * null when instance is returned from {@code ContacsResponse} or instance if part of {@code GroupChangeNotification}
     *
     * @see com.feed_the_beast.javacurselib.rest.GroupsWebService.Groups#get(CurseGUID, boolean)
     */
    public List<GroupRoleNotification> roles;
    public Map<Integer,Set<GroupPermissions>> rolePermissions; // key: roleId, value EnumSet
    public GroupMembershipNotification membership; // user's own status in the group
    public int memberCount;
    public List<GroupEmoticonNotification> emotes; // null in ContactsResponse
    /**
     * null when instance is part of {@code ContacsResponse} or {@code GroupChangeNotification}
     * null when instance is returned by {@link com.feed_the_beast.javacurselib.rest.GroupsWebService.Groups#get(CurseGUID, boolean)}
     *
     * @see com.feed_the_beast.javacurselib.rest.GroupsWebService.Groups#getMembers(CurseGUID, boolean, int, int)
     * @see com.feed_the_beast.javacurselib.rest.GroupsWebService.Groups#searchMembers(CurseGUID, GroupMemberSearchRequest)
     */
    public List<GroupMemberContract> members;
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
    public long avatarTimestamp;
    public boolean flaggedAsInappropriate;
    public int membersOnline;
    public boolean hideNoAccess;

    @Nonnull
    public Optional<Integer> getRoleIdbyName(String s) {
        for (GroupRoleNotification role: roles) {
            if (role.name.equals(s)) {
                return Optional.of(role.roleID);
            }
        }
        return Optional.empty();
    }

    @Nonnull
    public Optional<String> getRoleNamebyId(int id) {
        for (GroupRoleNotification role: roles) {
            if (role.roleID == id) {
                return Optional.of(role.name);
            }
        }
        return Optional.empty();
    }

    @Nonnull
    public Optional<String> getChannelNamebyId(CurseGUID id) {
        for (ChannelContract c : channels) {
            if (c.groupID.equals(id)) {
                return Optional.of(c.groupTitle);
            }
        }
        return Optional.empty();
    }

    @Nonnull
    public Optional<CurseGUID> getChannelIdByName(String s) {
        return getChannelIdByName(s, String::equals);
    }

    @Nonnull
    public Optional<CurseGUID> getChannelIdByName(String s, BiFunction<String, String, Boolean> function) {
        for (ChannelContract c : channels) {
            if ( function.apply(c.groupTitle, s)) {
                return Optional.of(c.groupID);
            }
        }
        return Optional.empty();
    }
}
