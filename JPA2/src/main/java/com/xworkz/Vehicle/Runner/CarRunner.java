package com.xworkz.Vehicle.Runner;

import com.xworkz.Vehicle.Entity.CarEntity;
import com.xworkz.Vehicle.Service.CarService;
import com.xworkz.Vehicle.Service.CarServiceImpl;

import java.util.List;

public class CarRunner {
    public static void main(String[] args) {
        CarService carService = new CarServiceImpl();
        carService.save(new CarEntity("Dodge","Black",5000,"Diesel"));
        carService.save(new CarEntity("Lamborghini","White",6000,"Diesel"));
        carService.save(new CarEntity("BMW","Blue",4000,"Petrol"));
        carService.save(new CarEntity("Porche","Yellow",7500,"Diesel"));
        carService.save(new CarEntity("Thor","Black",5000,"Petrol"));

        System.out.println("running getEntityByName");
        CarEntity carEntity1 = carService.getEntityByName("Porche");
        CarEntity carEntity2 = carService.getEntityByName("Lamborghini");
        System.out.println(carEntity1);
        System.out.println(carEntity2);

        System.out.println("running getEntityByNameAndColor");
        CarEntity carEntity3 = carService.getEntityByNameAndColor("BMW","Blue");
        CarEntity carEntity4 = carService.getEntityByNameAndColor("Dodge","Black");
        System.out.println(carEntity3);
        System.out.println(carEntity4);

        System.out.println("running getEntityByNameAndType");
        CarEntity carEntity5 = carService.getEntityByNameAndType("Thor","Petrol");
        CarEntity carEntity6 = carService.getEntityByNameAndType("Porche","Diesel");
        System.out.println(carEntity5);
        System.out.println(carEntity6);

        System.out.println("running getEntityByPrice");
//        CarEntity carEntity7 = carService.getEntitiesByPrice(7500);
//        CarEntity carEntity8 = carService.getEntitiesByPrice(4000);
        List<CarEntity> carEntities = carService.getEntitiesByPrice(7500);
//        List<CarEntity> carEntities1 = carService.getEntitiesByPrice(4000);
        for (CarEntity entity:carEntities){
            System.out.println(entity);
        }

    }
}
