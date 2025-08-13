package com.xworkz.Vehicle.Repository;

import com.xworkz.Vehicle.Entity.CarEntity;

public interface CarRepository {
    String  save(CarEntity car);
    CarEntity FindById(int id);
    CarEntity UpdateById(int id,String carName);
    CarEntity DeleteById(int id);

}
