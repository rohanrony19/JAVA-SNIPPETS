package com.xworkz.Vehicle.Service;

import com.xworkz.Vehicle.Entity.CarEntity;

import java.util.List;

public interface CarService {
    boolean save(CarEntity car);
   CarEntity getById(int id);
    List<CarEntity> getByName(String name);
    List<CarEntity> getByNameAndType(String name,String type);
    List<CarEntity> getByNameAndColor(String name,String color);
    List<CarEntity> getByPrice(int price);

}
