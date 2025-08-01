package com.xworkz.Football.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "china")
public class ChinaEntity {
    @Id
    private int id;

    @Column(name = "cities")
    private String cities;

    @Column(name = "number_of_provinces")
    private int number_of_provinces;

    @Column(name = "famous_food")
    private String famous_food;

    @Column(name = "famous_falls")
    private String famous_falls;

    @Column(name = "famous_place")
    private String famous_place;

    public ChinaEntity(int id, String cities, int number_of_provinces, String famous_food, String famous_falls, String famous_place) {
        this.id = id;
        this.cities = cities;
        this.number_of_provinces = number_of_provinces;
        this.famous_food = famous_food;
        this.famous_falls = famous_falls;
        this.famous_place = famous_place;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCities() {
        return cities;
    }

    public void setCities(String cities) {
        this.cities = cities;
    }

    public int getNumber_of_provinces() {
        return number_of_provinces;
    }

    public void setNumber_of_provinces(int number_of_provinces) {
        this.number_of_provinces = number_of_provinces;
    }

    public String getFamous_food() {
        return famous_food;
    }

    public void setFamous_food(String famous_food) {
        this.famous_food = famous_food;
    }

    public String getFamous_falls() {
        return famous_falls;
    }

    public void setFamous_falls(String famous_falls) {
        this.famous_falls = famous_falls;
    }

    public String getFamous_place() {
        return famous_place;
    }

    public void setFamous_place(String famous_place) {
        this.famous_place = famous_place;
    }

    @Override
    public String toString() {
        return "ChinaEntity{" +
                "id=" + id +
                ", cities='" + cities + '\'' +
                ", number_of_provinces=" + number_of_provinces +
                ", famous_food='" + famous_food + '\'' +
                ", famous_falls='" + famous_falls + '\'' +
                ", famous_place='" + famous_place + '\'' +
                '}';
    }
}
