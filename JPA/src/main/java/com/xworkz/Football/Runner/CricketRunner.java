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
        List<CricketEntity> cricketList = new ArrayList<>();
        cricketList.add(new CricketEntity(1, "Mumbai Indians", "India", 11, "Rohit Sharma", 130));
        cricketList.add(new CricketEntity(2, "Sydney Sixers", "Australia", 11, "Moises Henriques", 95));
        cricketList.add(new CricketEntity(3, "Chennai Super Kings", "India", 11, "MS Dhoni", 125));
        cricketList.add(new CricketEntity(4, "Melbourne Stars", "Australia", 11, "Glenn Maxwell", 85));
        cricketList.add(new CricketEntity(5, "Karachi Kings", "Pakistan", 11, "Imad Wasim", 72));
        cricketList.add(new CricketEntity(6, "Lahore Qalandars", "Pakistan", 11, "Shaheen Afridi", 68));
        cricketList.add(new CricketEntity(7, "Oval Invincibles", "England", 11, "Sam Billings", 47));
        cricketList.add(new CricketEntity(8, "Trinbago Knight Riders", "West Indies", 11, "Kieron Pollard", 103));
        cricketList.add(new CricketEntity(9, "Pretoria Capitals", "South Africa", 11, "Wayne Parnell", 36));
        cricketList.add(new CricketEntity(10, "Colombo Kings", "Sri Lanka", 11, "Angelo Mathews", 64));
        for (CricketEntity entity:cricketList){
            em.persist(entity);
        }
        et.commit();

        CricketEntity cricketEntity = em.find(CricketEntity.class,1);
        System.out.println(cricketEntity);
    }
}
