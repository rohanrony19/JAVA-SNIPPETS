package com.xworkz.interfaces.rule;

public class BagImpli implements Bag{

    @Override
    public void closeJip() {
        System.out.println("close zip");
    }

    @Override
    public void keepSafe() {
        System.out.println("keep safe");

    }

    @Override
    public void size() {
        System.out.println("bag size");

    }

    @Override
    public void need() {
        System.out.println("bag is needed");
    }
}
