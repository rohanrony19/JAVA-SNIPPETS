package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.animal.Animal;
import com.xworkz.inheritence.internal.animal.Dog;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
        animal.sleep();
        animal.sound();
        animal.run();
        animal.breathe();

        System.out.println("-----------------");
        Dog dog=new Dog();
        dog.eat();
        dog.sleep();
        dog.sound();
        dog.run();
        dog.breathe();

    }
}
