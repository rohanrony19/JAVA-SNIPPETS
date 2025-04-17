package com.xworkz.interfaces.rule;

public class Game implements Battery, Bet {

    @Override
    public void storePower() {
        System.out.println("Game stores power using a battery.");
    }

    @Override
    public void discharge() {
        System.out.println("Game battery is discharging during play.");
    }

    @Override
    public void isRechargeable() {
        System.out.println("Game battery is rechargeable.");
    }

    @Override
    public void place() {
        System.out.println("Placing a bet in the game.");
    }

    @Override
    public void win() {
        System.out.println("Game is won!");
    }

    @Override
    public void lose() {
        System.out.println("Game is lost.");
    }
}
