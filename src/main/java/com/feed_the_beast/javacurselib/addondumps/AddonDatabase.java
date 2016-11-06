package com.feed_the_beast.javacurselib.addondumps;

import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode
public class AddonDatabase {
    @SerializedName("data")
    public List<Addon> data;
    @SerializedName("timestamp")
    public long timestamp;
}
