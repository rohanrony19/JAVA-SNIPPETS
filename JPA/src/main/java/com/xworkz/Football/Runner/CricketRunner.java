package com.xworkz.Football.Runner;

import com.xworkz.Football.Entity.CricketEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class CricketRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        List<CricketEntity> list = new ArrayList<>();
        list.add(new CricketEntity());
        list
        for (CricketEntity entity:list){
            em.persist(entity);
        }
        et.commit();
    }
}
