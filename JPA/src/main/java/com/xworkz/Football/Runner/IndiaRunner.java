package com.xworkz.Football.Runner;

import com.xworkz.Football.Entity.IndiaEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class IndiaRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("location");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();

        List<IndiaEntity> indiaList = new ArrayList<>();

        indiaList.add(new IndiaEntity(1, "New Delhi", 28, "Butter Chicken", "Dudhsagar Falls", "India Gate"));
        indiaList.add(new IndiaEntity(2, "Mumbai", 1, "Vada Pav", "Vajrai Falls", "Gateway of India"));
        indiaList.add(new IndiaEntity(3, "Bangalore", 2, "Bisi Bele Bath", "Jog Falls", "Lalbagh Botanical Garden"));
        indiaList.add(new IndiaEntity(4, "Hyderabad", 3, "Hyderabadi Biryani", "Ethipothala Falls", "Charminar"));
        indiaList.add(new IndiaEntity(5, "Chennai", 1, "Dosa", "Hogenakkal Falls", "Marina Beach"));
        indiaList.add(new IndiaEntity(6, "Kolkata", 5, "Rosogolla", "Hundru Falls", "Victoria Memorial"));
        indiaList.add(new IndiaEntity(7, "Jaipur", 1, "Dal Baati Churma", "Bhimlat Falls", "Hawa Mahal"));
        indiaList.add(new IndiaEntity(8, "Ahmedabad", 2, "Dhokla", "Zarwani Waterfalls", "Sabarmati Ashram"));
        indiaList.add(new IndiaEntity(9, "Bhopal", 1, "Poha", "Bee Falls", "Sanchi Stupa"));
        indiaList.add(new IndiaEntity(10, "Pune", 4, "Misal Pav", "Thoseghar Falls", "Shaniwar Wada"));
        for (IndiaEntity entity:indiaList){
            em.persist(entity);
        }
        et.commit();

        IndiaEntity indiaEntity = em.find(IndiaEntity.class,8);
        System.out.println(indiaEntity);

    }
}
