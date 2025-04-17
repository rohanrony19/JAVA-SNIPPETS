package com.xworkz.interfaces.rule;

public interface Bet {
    void place();
    void win();
    void lose();
    default void notGood(){
        System.out.println("not good");
    }
}
