package com.xworkz.interfaces.rule;

public class Cat implements Radio, Rose, Remote, University, Platinum {

    @Override
    public void rareMetal() {
        System.out.println("Cat: Platinum is a rare metal.");
    }

    @Override
    public void usedInRings() {
        System.out.println("Cat: Platinum is used in rings.");
    }

    @Override
    public void doesNotTarnish() {
        System.out.println("Cat: Platinum does not tarnish.");
    }

    @Override
    public void tune() {
        System.out.println("Cat: Tuning the radio.");
    }

    @Override
    public void playMusic() {
        System.out.println("Cat: Playing music on the radio.");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Cat: Increasing the radio volume.");
    }

    @Override
    public void pressButton() {
        System.out.println("Cat: Pressing the remote button.");
    }

    @Override
    public void connectDevice() {
        System.out.println("Cat: Connecting device using the remote.");
    }

    @Override
    public void changeSetting() {
        System.out.println("Cat: Changing settings on the remote.");
    }

    @Override
    public void smell() {
        System.out.println("Cat: Smelling the rose.");
    }

    @Override
    public void bloom() {
        System.out.println("Cat: The rose is blooming.");
    }

    @Override
    public void hasThorns() {
        System.out.println("Cat: The rose has thorns.");
    }

    @Override
    public void conductExam() {
        System.out.println("Cat: Conducting an exam at the university.");
    }

    @Override
    public void publishResults() {
        System.out.println("Cat: Publishing the exam results.");
    }

    @Override
    public void grantDegrees() {
        System.out.println("Cat: Granting degrees to students at the university.");
    }
}
