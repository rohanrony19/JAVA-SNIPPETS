package com.xworkz.interfaces.rule;

public class KidImpli implements Kid {
    @Override
    public void play() {
        System.out.println("Kid is playing");
    }

    @Override
    public void learn() {
        System.out.println("Kid is learning");
    }

    @Override
    public void eat() {
        System.out.println("Kid is eating");
    }

    @Override
    public void child() {
        System.out.println("child");
    }
}
