package org.example;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music {
    List<String> songs = Arrays.asList("Фары", "РОзы", "Танцы странные");

    @Override
    public void getSong() { songs.forEach(System.out::println); }
}
