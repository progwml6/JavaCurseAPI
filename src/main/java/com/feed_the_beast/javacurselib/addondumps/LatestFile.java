package com.feed_the_beast.javacurselib.addondumps;

import java.util.List;

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
    //TODO List<object> Dependencies;
    public boolean isAvailable;
    public List<Module> modules;
    //TODO object PackageFingerprint;
    public List<String> gameVersion;

}
