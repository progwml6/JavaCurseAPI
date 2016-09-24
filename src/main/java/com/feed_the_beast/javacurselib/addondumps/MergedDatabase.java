package com.feed_the_beast.javacurselib.addondumps;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class MergedDatabase {
    public MergedDatabase () {
    }

    public MergedDatabase (AddonDatabase db) {
        currentDatabase = db;
        oldTimestamp = db.timestamp;
    }

    public AddonDatabase currentDatabase;
    //This isn't set in in all cases
    public AddonDatabase changes = null;
    //This isn't set in in all cases
    public DatabaseType newDBType = null;
    public long oldTimestamp;
}
