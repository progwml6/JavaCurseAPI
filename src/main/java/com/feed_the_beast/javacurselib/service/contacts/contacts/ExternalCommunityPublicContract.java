package com.feed_the_beast.javacurselib.service.contacts.contacts;

import com.feed_the_beast.javacurselib.common.enums.AccountType;

/**
 * representation of curse contacts api ExternalCommunityPublicContract
 */
public class ExternalCommunityPublicContract {
    public String externalID;
    public AccountType type;
    public String externalName;
    public int gameID;
    public String externalGameName;
    public String externalStatus;
    public String externalUrl;
    public boolean isLive;
}
