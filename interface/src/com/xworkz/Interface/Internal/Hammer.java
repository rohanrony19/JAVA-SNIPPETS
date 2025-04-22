package com.xworkz.Interface.Internal;

public class Hammer implements Tool{
    public Hammer() {
        System.out.println("No arg constructor Hammer");
    }

    @Override
    public void use() {
        System.out.println("Overriding use in Hammer");
    }
}
