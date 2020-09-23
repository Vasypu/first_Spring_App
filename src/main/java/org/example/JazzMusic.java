package org.example;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class JazzMusic implements Music {

    List<String> songs = Arrays.asList("Rsdf", "asfdsd", "jadsadkj");
    @Override
    public void getSong() { songs.forEach(System.out::println); }

//    private JazzMusic () {}

//    public static JazzMusic getJazzMusic () {
//        return new JazzMusic();
//    }

//    public void doMyInit () {
//        System.out.println("Doing init method");
//    }
//
//    public void doMyDestroy () {
//        System.out.println("Doing destroy method");
//    }

}
