package com.xworkz.Vehicle.Repository;

import com.xworkz.Vehicle.Entity.CarEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarRepositoryImpl implements CarRepository{
    @Override
    public String save(CarEntity car) {
        System.out.println("running save");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("car");

        EntityManager em = null;
        EntityTransaction et = null;
        em = emf.createEntityManager();
        et = em.getTransaction();
        et.begin();
        em.persist(car);
        if(et.isActive()){
            et.rollback();
        }
        return null;
    }

    @Override
    public CarEntity FindById(int id) {
        System.out.println("running FindById");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("car");

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        CarEntity carEntity1 = em.find(CarEntity.class,id);
        if(et.isActive()){
            et.rollback();
        }
        return carEntity1;
    }

    @Override
    public CarEntity UpdateById(int id, String carName) {
        System.out.println("running UpdateById");
        EntityManagerFactory emf;
        EntityManager em;
        EntityTransaction et;
        emf = Persistence.createEntityManagerFactory("car");
        em = emf.createEntityManager();
        et = em.getTransaction();
        et.begin();
        CarEntity carEntity2 = em.find(CarEntity.class,id);
        carEntity2.setCarName(carName);
        em.merge(carEntity2);
        et.commit();
        return carEntity2;
//        if (et.isActive()){
//            et.rollback();
//        }
//        return null;
    }

    @Override
    public CarEntity DeleteById(int id) {
        System.out.println("running deleteById");
        EntityManagerFactory emf = null;
        EntityManager em = null;
        EntityTransaction et = null;
        emf = Persistence.createEntityManagerFactory("car");
        em = emf.createEntityManager();
        et = em.getTransaction();
        et.begin();
        CarEntity carEntity3 = em.find(CarEntity.class,id);
        em.remove(carEntity3);
        et.commit();
        if(et.isActive()){
            et.rollback();
        }
        return null;
    }
}
