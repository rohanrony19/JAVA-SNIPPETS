package com.xworkz.food.service;

import com.xworkz.food.entity.FoodEntity;

import java.util.List;

public interface FoodService {
     boolean save(FoodEntity food);
     FoodEntity getFoodEntityByName(String name);
     List<FoodEntity> getAll();
}
