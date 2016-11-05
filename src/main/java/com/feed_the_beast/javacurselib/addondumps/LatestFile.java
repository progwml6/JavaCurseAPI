package com.feed_the_beast.javacurselib.addondumps;

import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode
public class LatestFile {
    public int id;
    public String fileName;
    public String fileNameOnDisk;
    public String fileDate;
    public int releaseType;
    public int fileStatus;
    public String downloadURL;
    public boolean isAlternate;
    public int alternateFileId;
    public List<Dependency> Dependencies;
    public boolean isAvailable;
    public List<Module> modules;
    public long packageFingerprint;
    public List<String> gameVersion;

}
