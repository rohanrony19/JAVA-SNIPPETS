package com.xworkz.food.service;

import com.xworkz.food.entity.FoodEntity;
import com.xworkz.food.repository.FoodRepository;
import com.xworkz.food.repository.FoodRepositoryImpl;

import java.util.Collections;
import java.util.List;

public class FoodServiceImpl implements FoodService{
    @Override
    public boolean save(FoodEntity food) {
        FoodRepository foodRepository = new FoodRepositoryImpl();
        foodRepository.save(food);
        return false;
    }

    @Override
    public FoodEntity getFoodEntityByName(String name) {
        return new FoodRepositoryImpl().getFoodEntityByName(name);
    }

    @Override
    public List<FoodEntity> getAll() {
        return new FoodRepositoryImpl().getAll();
    }
}
