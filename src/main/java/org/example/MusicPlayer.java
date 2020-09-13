package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int value;

    public MusicPlayer () {}

    public void setName(String name) { this.name = name; }

    public void setValue(int value) { this.value = value; }

    public String getName() { return name; }

    public int getValue() { return value; }

    public void setMusic(List<Music> musicList) { this.musicList = musicList; }

    public void playMusic () {
        for (Music music: musicList) {
            System.out.println("Playing " + music.getSong());
        }
    }
}
