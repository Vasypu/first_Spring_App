package org.example;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music {

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

    @Override
    public String getSong() { return "New music"; }
}
