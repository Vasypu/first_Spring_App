package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
//    @Autowired
//    @Qualifier("classicalMusic")
    private Music music1;
    private Music music2;
    @Autowired
    private ClassicalMusic classicalMusic;
    @Autowired
    private RockMusic rockMusic;

//    @Autowired
//    public void setMusic(@Qualifier("classicalMusic") Music classicalMusic,
//                         @Qualifier("jazzMusic") JazzMusic jazzMusic) {
//        this.music1 = classicalMusic;
//        this.music2 = jazzMusic;
//    }

//    public String playMusic () {
//        return "Playing " + classicalMusic.getSong() + " " + jazzMusic.getSong();
//        return "Playing " + music1.getSong() + " " + music2.getSong();
//    }

    public void playMusic () {
        classicalMusic.getSong();
        rockMusic.getSong();
    }
}
