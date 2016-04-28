package com.feed_the_beast.javacurselib.service.contacts.contacts;

import com.feed_the_beast.javacurselib.utils.GUID;

import java.util.List;
import java.util.Map;

/**
 * representation of curse contact api ChannelContract
 */
public class ChannelContract {
    public String GroupTitle;
    public GUID GroupID;
    public GUID ParentGroupID;
    public GUID RootGroupID;
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
