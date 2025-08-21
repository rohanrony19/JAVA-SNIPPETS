package com.xworkz.food.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "food_table")
@NamedQuery(name = "getAllByName",query = "Select entity from FoodEntity entity where foodName =: nameBy and cusine =: cusineBy")
@NamedQuery(name = "getAll",query = "Select entity from FoodEntity entity")
public class FoodEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "food_name")
    private String foodName;

    @Column(name = "food_price")
    private int foodPrice;

    @Column(name = "food_cusine")
    private String cusine;

    public FoodEntity(String foodName, int foodPrice, String cusine) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;














































































        this.cusine = cusine;
    }

    public FoodEntity(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(int foodPrice) {
        this.foodPrice = foodPrice;
    }

    public String getCusine() {
        return cusine;
    }

    public void setCusine(String cusine) {
        this.cusine = cusine;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof FoodEntity)) return false;
        FoodEntity that = (FoodEntity) o;
        return id == that.id && foodPrice == that.foodPrice && Objects.equals(foodName, that.foodName) && Objects.equals(cusine, that.cusine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, foodName, foodPrice, cusine);
    }

    @Override
    public String toString() {
        return "FoodEntity{" +
                "id=" + id +
                ", foodName='" + foodName + '\'' +
                ", foodPrice=" + foodPrice +
                ", cusine='" + cusine + '\'' +
                '}';
    }
}
