package com.xworkz.Vehicle.Repository;

import com.xworkz.Vehicle.Entity.CarEntity;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

public class CarRepositoryImpl implements CarRepository{
    EntityManagerFactory emf = null;
    @Override
    public boolean save(CarEntity car) {

        EntityManager em = null;
        EntityTransaction et = null;
        emf = Persistence.createEntityManagerFactory("car");
        em = emf.createEntityManager();
        et = em.getTransaction();
        et.begin();
        em.persist(car);
        et.commit();
        return true;
    }

    @Override
    public CarEntity getById(int id) {
        EntityManager em = null;
        EntityTransaction et = null;
        emf = Persistence.createEntityManagerFactory("car");
        em = emf.createEntityManager();
        et = em.getTransaction();
        et.begin();
        CarEntity carEntity = em.find(CarEntity.class,id);

        return carEntity;
    }

    @Override
    public List<CarEntity>  getByName(String name) {

        EntityManager em = null;
        EntityTransaction et = null;
        List<CarEntity> carEntities =null;

        try {
            emf = Persistence.createEntityManagerFactory("car");
            em = emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            Query query = em.createNamedQuery("EntityByName");
            query.setParameter("Name",name);
             carEntities =  (List<CarEntity>) query.getResultList();




            et.commit();


        } catch (Exception e) {
            System.out.println("no data found");
            if (et.isActive()){
                et.rollback();
            }
                e.printStackTrace();
        }
        finally {
            em.close();

        }
        return carEntities;
    }

    @Override
    public List<CarEntity> getByNameAndType(String name, String type) {
        EntityManager em = null;
        EntityTransaction et = null;
        List<CarEntity> carEntities =null;
        try {
            emf = Persistence.createEntityManagerFactory("car");
            em = emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            Query query = em.createNamedQuery("EntityByNameAndType");
            query.setParameter("name", name);
            query.setParameter("type", type);
            carEntities = (List<CarEntity>) query.getResultList();
            et.commit();
        }
        catch (Exception e) {
            System.out.println("no data found");
            if (et.isActive()){
                et.rollback();
            }
            e.printStackTrace();
        }
        finally {
            em.close();

        }
        return carEntities;
    }

    @Override
    public List<CarEntity> getBYNameAndColor(String name, String color) {
        EntityManager em = null;
        EntityTransaction et = null;
        List<CarEntity> carEntities = null;
        try{
            emf = Persistence.createEntityManagerFactory("car");
            em = emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            Query query = em.createNamedQuery("EntityByNameAndColor");
            query.setParameter("name",name);
            query.setParameter("color",color);
            carEntities = (List<CarEntity>) query.getResultList();
            et.commit();
        }
        catch (Exception e){
            System.out.println("getByNameAndColor not found");
            if(et.isActive()){
                et.rollback();
            }
            e.printStackTrace();
        }
        finally {
            em.close();
        }
        return carEntities;
    }

    @Override
    public List<CarEntity> getByPrice(int price) {
        EntityManager em = null;
        EntityTransaction et = null;
        List<CarEntity> carEntities = null;
        try{
            emf = Persistence.createEntityManagerFactory("car");
            em = emf.createEntityManager();
            et = em.getTransaction();
            et.begin();
            Query query = em.createNamedQuery("EntityByPrice");
            query.setParameter("price",price);

            carEntities = (List<CarEntity>) query.getResultList();
            et.commit();
        }
        catch (Exception e){
            System.out.println("EntityByPrice not found");
            if(et.isActive()){
                et.rollback();
            }
            e.printStackTrace();
        }
        finally {
            em.close();
        }
        return carEntities;

    }
}
