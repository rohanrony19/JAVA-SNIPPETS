package com.xworkz.inheritancetypes.hierarchical;

public class Game {
        void play() { System.out.println("Playing a game"); }
    }

    class Cricket extends Game {
        void bat() { System.out.println("Batting in cricket"); }
    }

    class Football extends Game {
        void kick() { System.out.println("Kicking the football"); }
    }

    class Tennis extends Game {
        void serveBall() { System.out.println("Serving in tennis");
    }
}
