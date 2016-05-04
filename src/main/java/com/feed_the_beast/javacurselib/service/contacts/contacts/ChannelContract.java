package com.feed_the_beast.javacurselib.service.contacts.contacts;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * representation of curse contact api ChannelContract
 */
public class ChannelContract {
    public String groupTitle;
    public UUID groupID;
    public UUID parentGroupID;
    public UUID rootGroupID;
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
