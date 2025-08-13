package com.xworkz.Vehicle.Service;

import com.xworkz.Vehicle.Entity.CarEntity;

import java.util.List;

public interface CarService {
    String save(CarEntity carEntity);
    CarEntity getEntityById(int id);
    CarEntity getEntityByName(String Name);
    CarEntity getEntityByNameAndType(String name, String type);
    CarEntity getEntityByNameAndColor(String name, String color);
    List<CarEntity> getEntitiesByPrice(int price);
}
