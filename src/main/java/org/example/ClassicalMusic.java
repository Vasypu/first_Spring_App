package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;

@Component
@Scope("prototype")
public class ClassicalMusic implements Music {

    List<String> songs = Arrays.asList("Туманы", "Желтые тюльпаны", "Рваные джинсы");

    @Override
    public void getSong() { songs.forEach(System.out::println); }

    @PostConstruct
    public void doMyInit () {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doDestroy () {
        System.out.println("Doing my destroy");
    }

}
