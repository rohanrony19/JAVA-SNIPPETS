package com.xworkz.interfaces.rule;

public class Medical implements Mars, Modhi, Moon, Money, Movie {

    // Mars Interface Methods
    @Override
    public void isRedPlanet() {
        System.out.println("Medical: Mars is known as the Red Planet.");
    }

    @Override
    public void hasDustStorms() {
        System.out.println("Medical: Mars experiences large dust storms.");
    }

    @Override
    public void hasMountains() {
        System.out.println("Medical: Mars has the largest volcano in the solar system.");
    }

    @Override
    public void planet() {
        System.out.println("Medical: Medical Sell drugs");
    }

    // Modhi Interface Methods
    @Override
    public void leadCountry() {
        System.out.println("Medical: Leading the country with a strong vision.");
    }

    @Override
    public void speak() {
        System.out.println("Medical: Speaking to the nation with clarity.");
    }

    @Override
    public void visitState() {
        System.out.println("Medical: Visiting a state for developmental progress.");
    }

    // Money Interface Methods
    @Override
    public void spend() {
        System.out.println("Medical: Spending money wisely for healthcare.");
    }

    @Override
    public void save() {
        System.out.println("Medical: Saving money for future medical needs.");
    }

    @Override
    public void invest() {
        System.out.println("Medical: Investing in medical research and development.");
    }

    // Moon Interface Methods
    @Override
    public void glow() {
        System.out.println("Medical: The moon glows brightly at night.");
    }

    @Override
    public void reflectSunlight() {
        System.out.println("Medical: The moon reflects sunlight.");
    }

    @Override
    public void appearAtNight() {
        System.out.println("Medical: The moon is visible in the night sky.");
    }

    // Movie Interface Methods
    @Override
    public void play() {
        System.out.println("Medical: The movie is now playing.");
    }

    @Override
    public void pause() {
        System.out.println("Medical: The movie is paused.");
    }

    @Override
    public void stop() {
        System.out.println("Medical: The movie has stopped.");
    }
}
