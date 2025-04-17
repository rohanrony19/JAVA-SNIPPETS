package com.xworkz.interfaces.rule;

public class PeopleImpli implements People {
    @Override
    public void talk() {
        System.out.println("People are talking");
    }

    @Override
    public void walk() {
        System.out.println("People are walking");
    }

    @Override
    public void help() {
        System.out.println("People are helping each other");
    }

    @Override
    public void dull() {
        System.out.println("people are dull");
    }
}
