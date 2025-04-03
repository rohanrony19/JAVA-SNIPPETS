package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.bird.Bird;
import com.xworkz.inheritence.internal.bird.Eagle;

public class BirdRunner {
    public static void main(String[] args) {
        Bird bird = new Eagle();
        bird.fly();
        bird.feathers();
        bird.laysEggs();
        bird.sound();
        bird.vision();

        System.out.println("-----------");

        Eagle eagle = new Eagle();
        eagle.fly();
        eagle.feathers();
        eagle.laysEggs();
        eagle.sound();
        eagle.vision();
    }
}
