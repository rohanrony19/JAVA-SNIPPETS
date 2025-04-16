package com.xworkz.inheritancetypes.multi;

public class Sport {
        void practice() { System.out.println("Practicing sport"); }
    }

    class BallSport extends Sport {
        void playWithBall() { System.out.println("Playing with a ball"); }
    }

    class Football extends BallSport {
        void kick() { System.out.println("Kicking the football"); }
}
