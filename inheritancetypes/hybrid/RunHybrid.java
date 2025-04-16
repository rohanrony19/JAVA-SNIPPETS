package com.xworkz.inheritancetypes.hybrid;

import com.xworkz.inheritancetypes.single.appliance.WashingMachine;

public class RunHybrid {
    public static void main(String[] args) {
        Bird bird=new Bird();
        bird.grow();
        bird.fly();
        bird.sing();
        System.out.println("**********************************");

        Dolphin dol=new Dolphin();
        dol.live();
        dol.swim();
        dol.communicate();
        System.out.println("**********************************");

        ElectricCar car=new ElectricCar();
        car.move();
        car.recharge();
        car.reduceEmissions();
        System.out.println("**********************************");

        Employee emp=new Employee();
        emp.breathe();
        emp.drive();
        emp.payTax();
        System.out.println("**********************************");

        House hs=new House();
        hs.construct();
        hs.supplyWater();
        hs.turnOnLights();
        System.out.println("**********************************");

        Laptop lap=new Laptop();
        lap.process();
        lap.carry();
        lap.connectWiFi();
        System.out.println("**********************************");

        PowerDrill pd=new PowerDrill();
        pd.use();
        pd.adjustSpeed();
        pd.charge();
        System.out.println("**********************************");

        Smartphone phone=new Smartphone();
        phone.powerOn();
        phone.playMusic();
        phone.takePhoto();
        System.out.println("**********************************");

        SmartTV tv=new SmartTV();
        tv.power();
        tv.connectInternet();
        tv.control();
        System.out.println("**********************************");

        Tablet tab=new Tablet();
        tab.boot();
        tab.read();
        tab.touch();
        System.out.println("**********************************");

    }
}
