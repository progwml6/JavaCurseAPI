package com.feed_the_beast.javacurselib.common.classes;

import com.feed_the_beast.javacurselib.common.enums.GroupPollDisplayType;
import com.feed_the_beast.javacurselib.common.enums.GroupPollDuplicateMode;
import com.feed_the_beast.javacurselib.common.enums.GroupPollStatus;
import lombok.ToString;

// TODO: complete
@ToString
public class GroupPollNotification {
    public String groupID;
    public long pollID;
    public String title;
    //public { [key: number]: string } options;
    //public { [key: number]: number } votes;
    public long startDate;
    public long[] requiredRoles;
    public boolean allowMultipleSelections;
    public GroupPollDisplayType displayType;
    public GroupPollStatus status;
    public String publicCode;
    public String publicUrl;
    public boolean allowRevotes;
    public GroupPollDuplicateMode duplicationMode;
}
