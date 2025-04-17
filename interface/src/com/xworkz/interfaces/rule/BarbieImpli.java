package com.xworkz.interfaces.rule;

public class BarbieImpli implements Barbie {
    @Override
    public void dressUp() {
        System.out.println("Barbie is dressed up");
    }

    @Override
    public void talk() {
        System.out.println("Barbie can talk");
    }

    @Override
    public void play() {
        System.out.println("Playing with Barbie");
    }

    @Override
    public void fav() {
        System.out.println("barbie is fav");
    }
}
