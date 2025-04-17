package com.xworkz.interfaces.rule;

public interface Movie {
    void play();
    void pause();
    void stop();

    default void watch() {
        System.out.println("Running in Movie");
    }
}
