package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.season.Season;
import com.xworkz.inheritence.internal.season.Winter;

public class SeasonRunner {
    public static void main(String[] args) {
        Season season = new Winter();
        season.weather();
        season.duration();
        season.activities();
        season.temperature();
        season.impact();

        System.out.println("-----------");

        Winter winter = new Winter();
        winter.weather();
        winter.duration();
        winter.activities();
        winter.temperature();
        winter.impact();
    }
}
