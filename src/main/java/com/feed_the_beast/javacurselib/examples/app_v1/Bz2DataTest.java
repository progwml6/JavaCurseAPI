package com.feed_the_beast.javacurselib.examples.app_v1;

import com.feed_the_beast.javacurselib.addondumps.AddonDatabase;
import com.feed_the_beast.javacurselib.addondumps.Bz2Data;
import com.feed_the_beast.javacurselib.addondumps.DatabaseType;

/**
 * Created by progwml6 on 11/5/16.
 */
public class Bz2DataTest {
    public static void main (String args[]) {
        System.out.println(Bz2Data.getDatabaseAsString(Bz2Data.MC_GAME_ID, DatabaseType.HOURLY));
        System.out.println("\n\n\n\n\n\n\n");
        String stringdb = Bz2Data.getDatabaseAsString(Bz2Data.MC_GAME_ID, DatabaseType.COMPLETE);
        System.out.println(stringdb.length());
        AddonDatabase db = Bz2Data.getDatabase(Bz2Data.MC_GAME_ID, DatabaseType.COMPLETE);
        System.out.println("size >> " + db.data.size());
    }
}
