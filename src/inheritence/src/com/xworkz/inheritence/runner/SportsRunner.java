package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.sports.Sports;
import com.xworkz.inheritence.internal.sports.Football;

public class SportsRunner {
    public static void main(String[] args) {
        Sports sport = new Football();
        sport.play();
        sport.rules();
        sport.competition();
        sport.team();
        sport.training();

        System.out.println("-----------");

        Football football = new Football();
        football.play();
        football.rules();
        football.competition();
        football.team();
        football.training();
    }
}
