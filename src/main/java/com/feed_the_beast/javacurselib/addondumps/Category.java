package com.feed_the_beast.javacurselib.addondumps;

import com.google.gson.annotations.SerializedName;

/**
 * Created by progwml6 on 9/1/16.
 */
public class Category {
    public int id;
    public String name;
    @SerializedName("URL")
    public String url;
}
