package com.xworkz.interfaces.rule;

public class BetImpli implements Bet {
    @Override
    public void place() {
        System.out.println("Placing a bet");
    }

    @Override
    public void win() {
        System.out.println("Won the bet");
    }

    @Override
    public void lose() {
        System.out.println("Lost the bet");
    }
}
