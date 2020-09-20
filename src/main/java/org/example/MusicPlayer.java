package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
//    @Autowired
    private Music music;
    private ClassicalMusic classicalMusic;
    private JazzMusic jazzMusic;

    @Autowired
    public void setMusic(ClassicalMusic classicalMusic, JazzMusic jazzMusic) {
        this.classicalMusic = classicalMusic;
        this.jazzMusic = jazzMusic;
    }

    public String playMusic () {
        return "Playing " + classicalMusic.getSong() + " " + jazzMusic.getSong();
    }
}
