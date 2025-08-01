package com.xworkz.Football.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "india")
public class IndiaEntity {
    @Id
    private int id;

    @Column(name = "capital_city")
    private String capitalCity;

    @Column(name = "number_of_states")
    private int noOfStates;

    @Column(name = "famous_food")
    private String famousFood;

    @Column(name = "famous_falls")
    private String famousFalls;

    @Column(name = "famous_place")
    private String famousPlace;

    public IndiaEntity(int id, String capitalCity, int noOfStates, String famousFood, String famousFalls, String famousPlace) {
        this.id = id;
        this.capitalCity = capitalCity;
        this.noOfStates = noOfStates;
        this.famousFood = famousFood;
        this.famousFalls = famousFalls;
        this.famousPlace = famousPlace;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    public int getNoOfStates() {
        return noOfStates;
    }

    public void setNoOfStates(int noOfStates) {
        this.noOfStates = noOfStates;
    }

    public String getFamousFood() {
        return famousFood;
    }

    public void setFamousFood(String famousFood) {
        this.famousFood = famousFood;
    }

    public String getFamousFalls() {
        return famousFalls;
    }

    public void setFamousFalls(String famousFalls) {
        this.famousFalls = famousFalls;
    }

    public String getFamousPlace() {
        return famousPlace;
    }

    public void setFamousPlace(String famousPlace) {
        this.famousPlace = famousPlace;
    }

    public IndiaEntity() {
    }

    @Override
    public String toString() {
        return "IndiaEntity{" +
                "id=" + id +
                ", capitalCity='" + capitalCity + '\'' +
                ", noOfStates=" + noOfStates +
                ", famousFood='" + famousFood + '\'' +
                ", famousFalls='" + famousFalls + '\'' +
                ", famousPlace='" + famousPlace + '\'' +
                '}';
    }
}
