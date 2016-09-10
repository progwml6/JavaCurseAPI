package com.feed_the_beast.javacurselib.addondumps;

public class Bz2Data {
    public static final String BASE_URL = "http://clientupdate-v6.cursecdn.com/feed/addons/432/v10/";
    public static final String COMPLETE_URL = BASE_URL + "complete.json.bz2";
    public static final String HOURLY_URL = BASE_URL + "hourly.json.bz2";

    public static long getHourlyTimestamp () {
        return Long.parseLong(getTimestampData(HOURLY_URL));
    }

    public static long getCompleteTimestamp () {
        return Long.parseLong(getTimestampData(COMPLETE_URL));
    }

    public static String getTimestampData (String url) {
        String newurl = url + ".txt";
        return getNetworkData(newurl);
    }

    public static String getNetworkData (String url) {
        return null;
    }

    public static String getHourlyFileUrl () {
        return HOURLY_URL + "?t=" + getHourlyTimestamp();
    }

    public static String getHourly() {
        return getAndDecompressBz2(getHourlyFileUrl());
    }
    public static String getComplete() {
        return getAndDecompressBz2(COMPLETE_URL);
    }
    public static String getAndDecompressBz2(String url){
        String data = getNetworkData(url);
        return decompress(data);
    }
    public static String decompress(String data) {

    }
}
