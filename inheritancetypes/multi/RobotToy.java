package com.xworkz.inheritancetypes.multi;

class Toy {
        void play() { System.out.println("Playing with toy"); }
    }

    class ElectronicToy extends Toy {
        void chargeToy() { System.out.println("Charging toy"); }
    }

    class RobotToy extends ElectronicToy {
        void perform() {
            System.out.println("Robot toy performing action");
        }
}
