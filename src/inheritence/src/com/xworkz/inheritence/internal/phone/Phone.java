package com.xworkz.inheritence.internal.phone;

public class Phone {
    public Phone() {
        System.out.println("Running non-arg constructor Phone");
    }
    public void call() {
        System.out.println("Phone can make calls");
    }
    public void message() {
        System.out.println("Phone can send messages");
    }
    public void camera() {
        System.out.println("Phone has a camera");
    }
    public void battery() {
        System.out.println("Phone has a battery");
    }
    public void internet() {
        System.out.println("Phone can browse the internet");
    }
}
