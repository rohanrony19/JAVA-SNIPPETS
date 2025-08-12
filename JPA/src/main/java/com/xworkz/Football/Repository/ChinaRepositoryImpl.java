package com.xworkz.Football.Repository;

import com.xworkz.Football.Entity.ChinaEntity;

import javax.persistence.*;
import java.util.List;

public class ChinaRepositoryImpl implements ChinaRepository{
    @Override
    public boolean save(ChinaEntity chinaEntity) {
        EntityManagerFactory emf = null;
        EntityManager em = null;
        EntityTransaction et = null;
        System.out.println(chinaEntity.toString());
        emf = Persistence.createEntityManagerFactory("location");
        em = emf.createEntityManager();
        et = em.getTransaction();
        et.begin();
        em.persist(chinaEntity);
        if(et.isActive()){
            et.rollback();
        }
        em.close();
        return false;
    }

    @Override
    public int getById(int id) {
        EntityManagerFactory emf = null;
        EntityManager em = null;
        EntityTransaction et = null;
        List<ChinaEntity> chinaEntities = null;
        emf = Persistence.createEntityManagerFactory("location");
        em = emf.createEntityManager();
        et = em.getTransaction();
        Query query = em.createNamedQuery("getById");
        chinaEntities = query.getResultList();
        et.begin();
        if(et.isActive()){
            et.rollback();
        }
        em.close();
        return 0;
    }

    @Override
    public String update(int id, String cities) {
        return "";
    }

    @Override
    public boolean remove(int id) {
        return false;
    }
}
