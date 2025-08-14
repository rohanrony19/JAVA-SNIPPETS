package com.xworkz.Vehicle.Repository;

import com.xworkz.Vehicle.Entity.CarEntity;

import java.util.List;

public interface CarRepository {
    boolean save(CarEntity car);
    CarEntity getById(int id);
    List<CarEntity>  getByName(String name);
    List<CarEntity> getByNameAndType(String name,String type);

}
