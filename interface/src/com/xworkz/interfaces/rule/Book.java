package com.xworkz.interfaces.rule;

public class Book implements Tomato, Teachers, Train, Temple, TV {

    @Override
    public void powerOn() {
        System.out.println("Book: Powering on the TV.");
    }

    @Override
    public void changeChannel() {
        System.out.println("Book: Changing the TV channel.");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Book: Increasing the TV volume.");
    }

    @Override
    public void teach() {
        System.out.println("Book: Teaching students.");
    }

    @Override
    public void evaluate() {
        System.out.println("Book: Evaluating students' progress.");
    }

    @Override
    public void guideStudents() {
        System.out.println("Book: Guiding students in their learning journey.");
    }

    @Override
    public void openGate() {
        System.out.println("Book: Opening the temple gate.");
    }

    @Override
    public void performPuja() {
        System.out.println("Book: Performing Puja in the temple.");
    }

    @Override
    public void ringBell() {
        System.out.println("Book: Ringing the temple bell.");
    }

    @Override
    public void isRed() {
        System.out.println("Book: Tomato is red.");
    }

    @Override
    public void juicy() {
        System.out.println("Book: Tomato is juicy.");
    }

    @Override
    public void usedInCurry() {
        System.out.println("Book: Tomato is used in curry.");
    }

    @Override
    public void run() {
        System.out.println("Book: Train is running.");
    }

    @Override
    public void stop() {
        System.out.println("Book: Train is stopping.");
    }

    @Override
    public void horn() {
        System.out.println("Book: Train horn is sounding.");
    }
}
