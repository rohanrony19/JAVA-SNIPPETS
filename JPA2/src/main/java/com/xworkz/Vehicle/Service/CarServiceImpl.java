package com.xworkz.Vehicle.Service;

import com.xworkz.Vehicle.Entity.CarEntity;
import com.xworkz.Vehicle.Repository.CarRepository;
import com.xworkz.Vehicle.Repository.CarRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{
    @Override
    public String save(CarEntity carEntity) {
        System.out.println("Running service");
        return new CarServiceImpl().save(carEntity);
    }

    @Override
    public CarEntity getEntityById(int id) {
        System.out.println("getEntityById");
        return new CarRepositoryImpl().FindById(2);
    }

    @Override
    public CarEntity getEntityByName(String Name) {

        return new CarRepositoryImpl().UpdateById("Porche");
    }
}
}
