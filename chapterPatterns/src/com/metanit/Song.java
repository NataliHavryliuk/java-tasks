package com.metanit;

public class Song {
    private String name;
    private String path;
    private ExtentionTypes extension;

    Song (String name, String path, ExtentionTypes extension){
        this.name = name;
        this.path = path;
        this.extension = extension;
    }

    public String getName(){
        return name;
    }
    public String getPath(){
        return path;
    }
    public ExtentionTypes getExtension(){
        return extension;
    }

}
