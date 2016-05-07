package com.feed_the_beast.javacurselib.service.contacts.contacts;

import com.feed_the_beast.javacurselib.CurseGUID;

import java.util.List;
import java.util.Map;

/**
 * representation of curse contact api ChannelContract
 */
public class ChannelContract {
    public String groupTitle;
    public CurseGUID groupID;
    public CurseGUID parentGroupID;
    public CurseGUID rootGroupID;
    public String voiceSessionCode;
    public String messageOfTheDay;
    public GroupMode groupMode;
    public GroupType groupType;
    public GroupStatus groupStatus;
    public int displayOrder;
    public boolean allowTemporaryChildGroups;
    public boolean forcePushToTalk;
    public boolean isDefaultChannel;
    public Map<Integer,Integer> rolePermissions;
    public boolean isPublic;
    public ChannelMembershipContract membership;
    public String urlPath;
    public List<GroupMemberContract> voiceMembers;
}
