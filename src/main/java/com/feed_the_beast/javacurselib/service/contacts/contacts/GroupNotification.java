package com.feed_the_beast.javacurselib.service.contacts.contacts;


import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * representation of curse contacts api GroupNotification
 */
public class GroupNotification {
    public String groupTitle;
    public UUID groupID;
    public UUID parentGroupID;
    public UUID rootGroupID;
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
    public List<GroupRoleNotification> roles;
    public Map<Integer,Integer> rolePermissions;
    public GroupMembershipNotification membership;
    public int memberCount;
    public List<GroupEmoticonNotification> emotes;
    public List<GroupMemberContract> members;
    public List<ChannelContract> channels;
    public GroupMode groupMode;
    public boolean isPublic;
    public String urlPath;
    public String urlHost;
    public boolean chatThrottleEnabled;
    public int chatThrottleSeconds;
    public boolean isStreaming;
    public List<ExternalCommunityPublicContract> linkedCommunities;
    public int afkTimerMins;
}