package com.xworkz.interfaces.rule;

public class MovieImpli implements Movie {
    @Override
    public void play() {
        System.out.println("Movie is playing");
    }

    @Override
    public void pause() {
        System.out.println("Movie is paused");
    }

    @Override
    public void stop() {
        System.out.println("Movie is stopped");
    }

    @Override
    public void watch() {
        System.out.println("watch movie");
    }
}
