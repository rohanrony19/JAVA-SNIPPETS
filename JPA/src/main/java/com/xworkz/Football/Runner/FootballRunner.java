package com.xworkz.Football.Runner;

import com.xworkz.Football.Entity.FootballEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FootballRunner {
    public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("football");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin(); 
        FootballEntity footballEntity = new FootballEntity(1,"Real Madrid","Spain");
        em.persist(footballEntity);
        et.commit();
    }
}
