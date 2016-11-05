package com.feed_the_beast.javacurselib.addondumps;

import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Category {
    public int id;
    public String name;
    @SerializedName("URL")
    public String url;
}
