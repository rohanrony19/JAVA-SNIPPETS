package com.xworkz.Vehicle.Runner;

import com.xworkz.Vehicle.Entity.CarEntity;
import com.xworkz.Vehicle.Service.CarService;
import com.xworkz.Vehicle.Service.CarServiceImpl;

import java.util.List;

public class CarRunner {
    public static void main(String[] args) {
        CarService carService = new CarServiceImpl();
//        carService.save(new CarEntity("Dodge", "Black", 5000, "Diesel"));
//        carService.save(new CarEntity("Lamborghini", "White", 6000, "Diesel"));
//        carService.save(new CarEntity("BMW", "Blue", 4000, "Petrol"));
//        carService.save(new CarEntity("Porche", "Yellow", 7500, "Diesel"));
//        carService.save(new CarEntity("Thor", "Black", 5000, "Petrol"));

        CarEntity carEntity = carService.getById(2);
        System.out.println(carEntity);

        List<CarEntity> carEntities = carService.getByName("BMW");
        System.out.println(carEntities);

        List<CarEntity> carEntities1 = carService.getByNameAndType("Porche","Diesel");
        System.out.println(carEntities1);

        List<CarEntity> carEntities2 = carService.getByNameAndColor("BMW","Blue");
        System.out.println(carEntities2);

        List<CarEntity> carEntities3 = carService.getByPrice(5000);
        System.out.println(carEntities3);
    }
}
