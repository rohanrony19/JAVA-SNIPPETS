package com.xworkz.interfaces.rule;

public class Karan implements India, Radio, Money, Sunflower, Lotion {

    // India Interface Methods
    @Override
    public void showCulture() {
        System.out.println("Karan: Showing Indian culture.");
    }

    @Override
    public void celebrateFestival() {
        System.out.println("Karan: Celebrating Indian festival.");
    }

    @Override
    public void growEconomy() {
        System.out.println("Karan: Growing India's economy.");
    }

    // Lotion Interface Methods
    @Override
    public void apply() {
        System.out.println("Karan: Applying lotion.");
    }

    @Override
    public void protectSkin() {
        System.out.println("Karan: Protecting skin with lotion.");
    }

    @Override
    public void moisturize() {
        System.out.println("Karan: Moisturizing skin.");
    }

    // Money Interface Methods
    @Override
    public void spend() {
        System.out.println("Karan: Spending money.");
    }

    @Override
    public void save() {
        System.out.println("Karan: Saving money.");
    }

    @Override
    public void invest() {
        System.out.println("Karan: Investing money.");
    }

    // Radio Interface Methods
    @Override
    public void tune() {
        System.out.println("Karan: Tuning the radio.");
    }

    @Override
    public void playMusic() {
        System.out.println("Karan: Playing music on the radio.");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Karan: Increasing the radio volume.");
    }

    // Sunflower Interface Methods
    @Override
    public void faceSun() {
        System.out.println("Karan: The sunflower is facing the sun.");
    }

    @Override
    public void produceSeeds() {
        System.out.println("Karan: Sunflower is producing seeds.");
    }

    @Override
    public void growTall() {
        System.out.println("Karan: Sunflower is growing tall.");
    }
}
