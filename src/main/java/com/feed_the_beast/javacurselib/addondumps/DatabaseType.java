package com.feed_the_beast.javacurselib.addondumps;

public enum DatabaseType {

    COMPLETE(604801, Long.MAX_VALUE),
    WEEKLY(86401, 604800),
    DAILY(3601, 86400),
    HOURLY(0, 3600);

    private long minValue, maxValue;

    DatabaseType (long minValue, long maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public String getStringForUrl () {
        return this.toString().toLowerCase();
    }

    /**
     * Gets URL needed to get the timestamp
     */
    public String getTimestampUrl (String game) {
        return Bz2Data.BASE_URL.replace("{}", game) + this.getStringForUrl() + ".json.bz2.txt";
    }

    /**
     * Gets the URL to request the database type at a specific time.
     */
    public String getDownloadUrl (String game, long timestamp) {
        return Bz2Data.BASE_URL.replace("{}", game) + this.getStringForUrl() + ".json.bz2?t=" + timestamp;
    }

    /**
     *
     * @return the minimum difference needed to use this file
     */
    public Long getMinValue () {
        return minValue;
    }

    /**
     *
     * @return the minimum difference needed to use this file
     */
    public Long getMaxValue () {
        return maxValue;
    }
}

