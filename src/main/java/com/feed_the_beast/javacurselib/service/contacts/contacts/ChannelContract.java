package com.feed_the_beast.javacurselib.service.contacts.contacts;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * representation of curse contact api ChannelContract
 */
public class ChannelContract {
    public String GroupTitle;
    public UUID GroupID;
    public UUID ParentGroupID;
    public UUID RootGroupID;
    public String VoiceSessionCode;
    public String MessageOfTheDay;
    public GroupMode GroupMode;
    public GroupType GroupType;
    public GroupStatus GroupStatus;
    public int DisplayOrder;
    public boolean AllowTemporaryChildGroups;
    public boolean ForcePushToTalk;
    public boolean IsDefaultChannel;
    public Map<Integer,Integer> RolePermissions;
    public boolean IsPublic;
    public ChannelMembershipContract Membership;
    public String UrlPath;
    public List<GroupMemberContract> VoiceMembers;
}
