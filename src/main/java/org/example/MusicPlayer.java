package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.value}")
    private int value;

    public String getName() { return name; }


    public int getValue() { return value; }

    //    @Autowired
//    @Qualifier("classicalMusic")
    private Music music1;
    private Music music2;
//    @Autowired
//    private ClassicalMusic classicalMusic;
//    @Autowired
//    private RockMusic rockMusic;

//    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic,
                         @Qualifier("jazzMusic") JazzMusic jazzMusic) {
        this.music1 = classicalMusic;
        this.music2 = jazzMusic;
    }

//    public String playMusic () {
//        return "Playing " + classicalMusic.getSong() + " " + jazzMusic.getSong();
//        return "Playing " + music1.getSong() + " " + music2.getSong();
//    }

    public void playMusic () {
        music1.getSong();
        music2.getSong();
    }
}
