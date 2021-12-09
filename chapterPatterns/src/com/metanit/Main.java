package com.metanit;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        PlayerFactory factory = new PlayerFactory();
        ArrayList<Song> songsList = new ArrayList<>();
        songsList.add(new Song("song1", "audios/sting", ExtentionTypes.MP3));
        songsList.add(new Song("song1", "audios/sting", ExtentionTypes.MPEG));
        songsList.add(new Song("song2", "audios/sting", ExtentionTypes.MP3));
        songsList.add(new Song("song2", "audios/sting", ExtentionTypes.MPEG));

        for (Song song: songsList){
            Player player = factory.getPlayer(song);
            player.play();

        }

	// write your code here
    }
}
