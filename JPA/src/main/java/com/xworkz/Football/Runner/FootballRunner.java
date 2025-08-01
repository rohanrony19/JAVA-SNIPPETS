package com.xworkz.Football.Runner;

import com.xworkz.Football.Entity.FootballEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class FootballRunner {
    public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
//        FootballEntity footballEntity = new FootballEntity(1,"Real Madrid","Spain",11,"Dani Carvajal",101);

        List<FootballEntity> list = new ArrayList<>();
        list.add(new FootballEntity(1,"Real Madrid","Spain",11,"Dani Carvajal",101));
        list.add(new FootballEntity(2,"Manchester United", "England", 11, "Bruno Fernandes", 25));
        list.add(new FootballEntity(3,"Ajax", "Netherlands", 11, "Steven Bergwijn", 21));
        list.add(new FootballEntity(4,"Bayern Munich", "Germany", 11, "Manuel Neuer", 28));
        list.add(new FootballEntity(5,"Juventus", "Italy", 11, "Danilo", 24));
        list.add(new FootballEntity(6,"Paris Saint-Germain", "France", 11, "Marquinhos", 27));
        list.add(new FootballEntity(7,"Barcelona", "Spain", 11, "Robert Lewandowski", 26));
        list.add(new FootballEntity(8,"Chelsea", "England", 11, "Reece James", 20));
        list.add(new FootballEntity(9,"AC Milan", "Italy", 11, "Davide Calabria", 22));
        list.add(new FootballEntity(10,"Borussia Dortmund", "Germany", 11, "Marco Reus", 23));
        for(FootballEntity entity:list){
            em.persist(entity);
        }


        et.commit();

        FootballEntity footballEntity=em.find(FootballEntity.class,7);
        System.out.println(footballEntity);
    }
}
