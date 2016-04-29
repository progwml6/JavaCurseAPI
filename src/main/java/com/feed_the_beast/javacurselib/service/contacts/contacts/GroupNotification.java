package com.feed_the_beast.javacurselib.service.contacts.contacts;


import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * representation of curse contacts api GroupNotification
 */
public class GroupNotification {
    public String GroupTitle;
    public UUID GroupID;
    public UUID ParentGroupID;
    public UUID RootGroupID;
    public String VoiceSessionCode;
    public String MessageOfTheDay;
    public GroupType GroupType;
    public GroupSubType GroupSubType;
    public int DisplayOrder;
    public boolean MetaDataOnly;
    public boolean AllowTemporaryChildGroups;
    public boolean ForcePushToTalk;
    public GroupStatus Status;
    public boolean isDefaultChannel;
    public List<GroupRoleNotification> Roles;
    public Map<Integer,Integer> RolePermissions;
    public GroupMembershipNotification Membership;
    public int MemberCount;
    public List<GroupEmoticonNotification> Emotes;
    public List<GroupMemberContract> Members;
    public List<ChannelContract> Channels;
    public GroupMode GroupMode;
    public boolean IsPublic;
    public String UrlPath;
    public String UrlHost;
    public boolean ChatThrottleEnabled;
    public int ChatThrottleSeconds;
    public boolean isStreaming;
    public List<ExternalCommunityPublicContract> LinkedCommunities;
    public int AfkTimerMins;
}
