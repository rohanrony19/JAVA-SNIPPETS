package com.xworkz.rohan.repository;

import com.xworkz.rohan.entity.SignUpEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SignUpRepositoryImpl implements SignUpRepository{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
    @Override
    public String save(SignUpEntity signUp) {
        System.out.println("in repo");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();
            em.persist(signUp);
            et.commit();
        }catch (Exception e){
            if(et.isActive()){
                et.rollback();
                return "data not saved";
            }
        }finally {
            em.close();
        }

        return "data has been saved";

    }
}
