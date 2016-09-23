package com.feed_the_beast.javacurselib.service.groups.servers;

import com.feed_the_beast.javacurselib.common.enums.GroupSubType;
import com.feed_the_beast.javacurselib.utils.CurseGUID;

import java.util.List;

public class GroupSearchModelContract {
    public CurseGUID groupID;
    public String groupTitle;
    public int ownerUserID;
    public String ownerUsername;
    public List<GroupSearchTag> tags;
    public boolean isPublic;
    public String description;
    public int memberCount;
    public List<Integer> games;//TODO this needs to go to game objects that are easier to work with
    public boolean matchAllGames;
    public boolean isStreaming;
    public long streamingTimestamp;
    public GroupSubType subType;
    public boolean isFeatured;
    public long featuredTimestamp;
    public boolean flaggedAsInnapropriate;
    public long creationTimestamp;
}
