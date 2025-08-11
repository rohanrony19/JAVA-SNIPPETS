package com.xworkz.food.repository;

import com.xworkz.food.entity.FoodEntity;

import java.util.List;

public interface FoodRepository {
    boolean save(FoodEntity food);

    FoodEntity getFoodEntityByName(String name);
    List<FoodEntity> getAll();
}
