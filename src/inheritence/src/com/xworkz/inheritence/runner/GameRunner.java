package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.game.Game;
import com.xworkz.inheritence.internal.game.Chess;

public class GameRunner {
    public static void main(String[] args) {
        Game game = new Chess();
        game.play();
        game.strategy();
        game.opponent();
        game.winner();
        game.duration();

        System.out.println("-----------");

        Chess chess = new Chess();
        chess.play();
        chess.strategy();
        chess.opponent();
        chess.winner();
        chess.duration();
    }
}
