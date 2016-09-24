package com.feed_the_beast.javacurselib.addondumps;

import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class CategorySection {
    @SerializedName("ID")
    public int id;
    public int gameID;
    public String name;
    public int packageType;
    public String path;
    public String initialInclusionPattern;
    public String extraIncludePattern;
}
