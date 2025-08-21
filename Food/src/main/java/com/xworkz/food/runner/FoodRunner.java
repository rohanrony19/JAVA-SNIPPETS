package com.xworkz.food.runner;

import com.xworkz.food.entity.FoodEntity;
import com.xworkz.food.service.FoodService;
import com.xworkz.food.service.FoodServiceImpl;

import java.util.List;

public class FoodRunner {
    public static void main(String[] args) {
        FoodService foodService = new FoodServiceImpl();
        List<FoodEntity> foodEntities = foodService.getAll();
        for(FoodEntity food:foodEntities){
            System.out.println(food);
        }
    }
}
