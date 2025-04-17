package com.xworkz.interfaces.rule;


public class Aruna implements Orange, Radio, Teachers, Dead, Engine {

    @Override
    public void remember() {
        System.out.println("Aruna: Remembering the past.");
    }

    @Override
    public void bury() {
        System.out.println("Aruna: Burying the deceased.");
    }

    @Override
    public void mourn() {
        System.out.println("Aruna: Mourning the loss.");
    }

    // Engine Interface Methods
    @Override
    public void start() {
        System.out.println("Aruna: Engine starting.");
    }

    @Override
    public void consumeFuel() {
        System.out.println("Aruna: Engine is consuming fuel.");
    }

    @Override
    public void stop() {
        System.out.println("Aruna: Engine stopping.");
    }

    // Orange Interface Methods
    @Override
    public void isCitrus() {
        System.out.println("Aruna: Orange is a citrus fruit.");
    }

    @Override
    public void hasVitaminC() {
        System.out.println("Aruna: Orange is rich in Vitamin C.");
    }

    @Override
    public void isRound() {
        System.out.println("Aruna: Orange is round in shape.");
    }

    @Override
    public void tune() {
        System.out.println("Aruna: Tuning the radio.");
    }

    @Override
    public void playMusic() {
        System.out.println("Aruna: Playing music on the radio.");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Aruna: Increasing the radio volume.");
    }

    // Teachers Interface Methods
    @Override
    public void teach() {
        System.out.println("Aruna: Teaching students.");
    }

    @Override
    public void evaluate() {
        System.out.println("Aruna: Evaluating student performance.");
    }

    @Override
    public void guideStudents() {
        System.out.println("Aruna: Guiding students through their learning process.");
    }
}
