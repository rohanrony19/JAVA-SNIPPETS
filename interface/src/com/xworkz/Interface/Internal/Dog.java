package com.xworkz.Interface.Internal;

public class Dog implements Animal{
    public Dog() {
        System.out.println("No arg constructor Dog");
    }

    @Override
    public void speak() {
        System.out.println("Overriding speak in Dog");
    }
}
