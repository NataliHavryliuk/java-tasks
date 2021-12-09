package com.metanit;

public class PlayerFactory {
    public Player getPlayer (Song song){
        Player toRetunn = null;
        switch (song.getExtension()){
            case MP3:
                toRetunn = new PlayerMP3();
                break;
            case MPEG:
                toRetunn = new PlayerMPEG();
                break;
            default:
                throw new IllegalArgumentException("Wrong Extention type:" + song.getExtension());
        }
        return toRetunn;
    }
}
