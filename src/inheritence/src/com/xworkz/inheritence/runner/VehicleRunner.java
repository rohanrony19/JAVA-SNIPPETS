package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.vehicle.Vehicle;
import com.xworkz.inheritence.internal.vehicle.Car;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.move();
        vehicle.stop();
        vehicle.fuel();
        vehicle.speed();
        vehicle.transport();

        System.out.println("-----------");
        Car car=new Car();
        car.move();
        car.stop();
        car.fuel();
        car.speed();
        car.transport();

    }
}
