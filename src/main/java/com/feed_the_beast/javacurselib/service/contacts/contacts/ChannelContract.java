package com.feed_the_beast.javacurselib.service.contacts.contacts;

import com.feed_the_beast.javacurselib.common.classes.GroupMemberContract;
import com.feed_the_beast.javacurselib.common.enums.GroupMode;
import com.feed_the_beast.javacurselib.common.enums.GroupPermissions;
import com.feed_the_beast.javacurselib.common.enums.GroupStatus;
import com.feed_the_beast.javacurselib.common.enums.GroupType;
import com.feed_the_beast.javacurselib.utils.CurseGUID;
import com.feed_the_beast.javacurselib.websocket.messages.notifications.GroupChangeNotification;
import lombok.ToString;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * representation of curse contact api ChannelContract
 */
 @ToString
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
    /**
     * Not present when instance is returned from {@code ContactsWebService}
     */
    public String displayCategory;          // missing in ContactsResponse
    /**
     * Not present when instance is returned from {@code ContactsWebService}
     */
    public CurseGUID displayCategoryID;     // missing in ContactsResponse
    /**
     * Not present when instance is returned from {@code ContactsWebService}
     */
    public int displayCategoryRank;         // missing in ContactsResponse
    public boolean allowTemporaryChildGroups;
    public boolean forcePushToTalk;
    public boolean isDefaultChannel;

    /**
     *  Takes preference over groupwide role configuration
     *
     *  @see com.feed_the_beast.javacurselib.service.contacts.contacts.GroupNotification#rolePermissions
     */
    public Map<Integer,Set<GroupPermissions>> rolePermissions;
    public boolean isPublic;
    public ChannelMembershipContract membership;
    public String urlPath;
    public List<GroupMemberContract> voiceMembers;
    public boolean hideNoAccess;

    public ChannelContract() {
    }

    public ChannelContract(GroupNotification groupNotification) {
        groupID = groupNotification.groupID;
        displayOrder = groupNotification.displayOrder;
        forcePushToTalk = groupNotification.forcePushToTalk;
        groupMode = groupNotification.groupMode;
        groupStatus = groupNotification.status;
        groupTitle = groupNotification.groupTitle;
        groupType = groupNotification.groupType;
        allowTemporaryChildGroups = groupNotification.allowTemporaryChildGroups;
        isDefaultChannel = groupNotification.isDefaultChannel;
        isPublic = groupNotification.isPublic;
        //nopenopenope membership = groupNotification.membership;
        messageOfTheDay = groupNotification.messageOfTheDay;
        parentGroupID = groupNotification.parentGroupID;
        rolePermissions = groupNotification.rolePermissions;
        rootGroupID = groupNotification.rootGroupID;
        urlPath = groupNotification.urlPath;
        voiceMembers = null;
        voiceSessionCode = groupNotification.voiceSessionCode;
        hideNoAccess = groupNotification.hideNoAccess;
    }
}
