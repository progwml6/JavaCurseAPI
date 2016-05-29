package com.feed_the_beast.javacurselib.common.classes;

import com.feed_the_beast.javacurselib.common.enums.FriendPlatform;
import com.feed_the_beast.javacurselib.common.enums.FriendSuggestionType;

public class FriendSuggestionContract {
    public long FriendID;
    public String Username;
    public String AvatarUrl;
    public int FriendCount;
    public FriendSuggestionType type;
    public long GameID;
    public FriendPlatform platform;
}
