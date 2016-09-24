package com.feed_the_beast.javacurselib.addondumps;

import com.google.gson.annotations.SerializedName;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode
public class Addon {
    public int id;
    public String name;
    public List<Author> authors;
    public List<Attachment> attachments;
    @SerializedName("WebSiteURL")
    public String websiteURL;
    public int gameId;
    public String summary;
    public int defaultFileId;
    public int commentCount;
    public double downloadCount;
    public int rating;
    public int installCount;
    public int iconId;
    public List<LatestFile> latestFiles;
    public List<Category> categories;
    public String primaryAuthorName;
    public String externalUrl;
    public int status;
    public int stage;
    public String donationUrl;
    public int primaryCategoryId;
    public String primaryCategoryName;
    public String primaryCategoryAvatarUrl;
    public int likes;
    public CategorySection categorySection;
    public int packageType;
    public String avatarUrl;
    public List<GameVersionLatestFile> gameVersionLatestFiles;
    public int isFeatured;
    public double popularityScore;

}
