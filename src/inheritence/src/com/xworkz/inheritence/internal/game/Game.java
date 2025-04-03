package com.xworkz.inheritence.internal.game;

public class Game {
    public Game() {
        System.out.println("Running non-arg constructor Game");
    }
    public void play() {
        System.out.println("Game is played");
    }
    public void strategy() {
        System.out.println("Game requires strategy");
    }
    public void opponent() {
        System.out.println("Game has opponents");
    }
    public void winner() {
        System.out.println("Game has a winner");
    }
    public void duration() {
        System.out.println("Game has a duration");
    }
}
