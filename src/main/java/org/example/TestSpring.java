package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        JazzMusic jazzMusic = context.getBean("jazzMusic", JazzMusic.class);
        System.out.println(jazzMusic.getSong());

        context.close();
    }
}
