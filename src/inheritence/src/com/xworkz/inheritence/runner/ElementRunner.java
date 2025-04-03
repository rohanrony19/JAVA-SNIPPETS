package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.element.Element;
import com.xworkz.inheritence.internal.element.Oxygen;

public class ElementRunner {
    public static void main(String[] args) {
        Element element = new Oxygen();
        element.atomicNumber();
        element.symbol();
        element.state();
        element.bonding();
        element.reactivity();

        System.out.println("-----------");

        Oxygen oxygen = new Oxygen();
        oxygen.atomicNumber();
        oxygen.symbol();
        oxygen.state();
        oxygen.bonding();
        oxygen.reactivity();
    }
}
