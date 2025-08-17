package com.xworkz.Vehicle.Service;

import com.xworkz.Vehicle.Entity.CarEntity;
import com.xworkz.Vehicle.Repository.CarRepository;
import com.xworkz.Vehicle.Repository.CarRepositoryImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarServiceImpl implements CarService{
    @Override
    public boolean save(CarEntity car) {
        return new CarRepositoryImpl().save(car);
    }

    @Override
    public CarEntity getById(int id) {
        return new CarRepositoryImpl().getById(id);
    }

    @Override
    public List<CarEntity>  getByName(String name) {
        return new CarRepositoryImpl().getByName(name);
    }

    @Override
    public List<CarEntity> getByNameAndType(String name, String type) {
        return new CarRepositoryImpl().getByNameAndType(name,type);
    }

    @Override
    public List<CarEntity> getByNameAndColor(String name, String color) {

        return new CarRepositoryImpl().getBYNameAndColor(name,color);
    }

    @Override
    public List<CarEntity> getByPrice(int price) {
        return new CarRepositoryImpl().getByPrice(price);
    }
}
