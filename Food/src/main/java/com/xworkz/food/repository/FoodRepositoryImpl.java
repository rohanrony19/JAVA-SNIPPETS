package com.xworkz.food.repository;

import com.xworkz.food.entity.FoodEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FoodRepositoryImpl implements FoodRepository {
    @Override
    public boolean save(FoodEntity food) {
        EntityManagerFactory emf = null;
        EntityManager em = null;
        EntityTransaction et = null;
        System.out.println(food.toString());
        try {
            emf = Persistence.createEntityManagerFactory("food");
            em = emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
//        List<FoodEntity> list = new ArrayList<>();
//        list.add(new FoodEntity("dosa",70,"southIndian"));
//        list.add(new FoodEntity("idly",80,"southIndian"));
//        list.add(new FoodEntity("roti",70,"NorthIndian"));
            em.persist(food);
//        for(FoodEntity foodEntity:list){
//
//        }
            et.commit();
        }catch (Exception e) {
            if (et.isActive()) {
                et.rollback();
            }
        }finally {
            em.close();
        }
        return false;
    }

    @Override
    public FoodEntity getFoodEntityByName(String name) {

            EntityManagerFactory emf = null;
            EntityManager em = null;
            EntityTransaction et = null;
            FoodEntity foodEntity = null;
            try {
            emf = Persistence.createEntityManagerFactory("food");
            em = emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            Query query = em.createNamedQuery("getAllByName");
            query.setParameter("nameBy", name);
//            query.setParameter("cusineBy", cusine);
            foodEntity = (FoodEntity) query.getSingleResult();
            et.commit();
        }catch (Exception e) {
            if (et.isActive()){
                et.rollback();
            }
            e.printStackTrace();
        }
        finally {
            em.close();
        }
        return foodEntity;
    }

    @Override
    public List<FoodEntity> getAll() {
        EntityManagerFactory emf = null;
        EntityManager em = null;
        EntityTransaction et = null;
        List<FoodEntity> foodEntity = null;
        try {
            emf = Persistence.createEntityManagerFactory("food");
            em = emf.createEntityManager();
            et = em.getTransaction();
            Query query = em.createNamedQuery("getAll");
            foodEntity = query.getResultList();
            et.begin();
        }catch (Exception e) {
            if (et.isActive()) {
                et.rollback();
            }
            e.printStackTrace();
        }
        finally {
            em.close();
        }

        return foodEntity;
    }
}
