package com.xworkz.inheritence.internal.gadget;

public class Gadget {
    public Gadget() {
        System.out.println("Running non-arg constructor Gadget");
    }
    public void powerOn() {
        System.out.println("Gadget is powered on");
    }
    public void powerOff() {
        System.out.println("Gadget is powered off");
    }
    public void charge() {
        System.out.println("Gadget is charging");
    }
    public void connect() {
        System.out.println("Gadget connects to network");
    }
    public void brand() {
        System.out.println("Gadget has a brand");
    }
}
