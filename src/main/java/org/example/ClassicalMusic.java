package org.example;

import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    List<String> songs = Arrays.asList("Туманы", "Желтые тюльпаны", "Рваные джинсы");

    @Override
    public void getSong() { songs.forEach(System.out::println); }
}
