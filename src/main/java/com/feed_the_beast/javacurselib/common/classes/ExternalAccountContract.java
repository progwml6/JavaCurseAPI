package com.feed_the_beast.javacurselib.common.classes;

import com.feed_the_beast.javacurselib.common.enums.AccountType;

public class ExternalAccountContract {
    public String externalID;
    public String externalName;
    public AccountType type;
    public boolean isPartnered;
    public long dateLinked;
    public boolean eligibleForVanityUrl;
    public boolean needsReauthentication;
}
