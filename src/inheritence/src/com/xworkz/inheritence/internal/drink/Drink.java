package com.xworkz.inheritence.internal.drink;

public class Drink {
    public Drink() {
        System.out.println("Running non-arg constructor Drink");
    }
    public void sip() {
        System.out.println("Drink is sipped");
    }
    public void refresh() {
        System.out.println("Drink is refreshing");
    }
    public void cold() {
        System.out.println("Drink can be cold");
    }
    public void sweet() {
        System.out.println("Drink can be sweet");
    }
    public void healthy() {
        System.out.println("Drink can be healthy");
    }
}
