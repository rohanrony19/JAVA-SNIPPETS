package com.xworkz.Football.Runner;

import com.xworkz.Football.Entity.ChinaEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class ChinaRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("location");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        List<ChinaEntity> chinaList = new ArrayList<>();
        chinaList.add(new ChinaEntity(1, "Beijing", 23, "Peking Duck", "Huangguoshu Falls", "Great Wall of China"));
        chinaList.add(new ChinaEntity(2, "Shanghai", 23, "Xiaolongbao", "Jiulong Waterfall", "The Bund"));
        chinaList.add(new ChinaEntity(3, "Guangzhou", 23, "Dim Sum", "Detian Falls", "Canton Tower"));
        chinaList.add(new ChinaEntity(4, "Chengdu", 23, "Hot Pot", "Nuorilang Falls", "Chengdu Panda Base"));
        chinaList.add(new ChinaEntity(5, "Xi'an", 23, "Roujiamo", "Qinglong Waterfall", "Terracotta Army"));
        chinaList.add(new ChinaEntity(6, "Hangzhou", 23, "Dongpo Pork", "Feilai Falls", "West Lake"));
        chinaList.add(new ChinaEntity(7, "Harbin", 23, "Guo Bao Rou", "Shankou Falls", "Harbin Ice Festival"));
        chinaList.add(new ChinaEntity(8, "Shenzhen", 23, "Cantonese BBQ", "Heishui River Falls", "Window of the World"));
        chinaList.add(new ChinaEntity(9, "Lhasa", 23, "Tsampa", "Nyang River Falls", "Potala Palace"));
        chinaList.add(new ChinaEntity(10, "Nanjing", 23, "Salted Duck", "Yuntaishan Falls", "Sun Yat-sen Mausoleum"));
        for(ChinaEntity entity:chinaList){
            em.persist(entity);
        }


//        ChinaEntity chinaEntity = em.find(ChinaEntity.class,10);

        em.remove(10);
//        chinaEntity.setCities("Huzuki");
//        em.merge(chinaEntity);
        et.commit();
//        System.out.println(chinaEntity); 

//        for (ChinaEntity entity : chinaList) {
//            ChinaEntity existing = em.find(ChinaEntity.class, 6);
//            if (existing == null) {
//                em.persist(entity); // Insert only if not present
//            } else {
//                existing.setCities("Huzuki");
//                em.merge(entity);   // Or update existing if needed
//
//            }
//        }
//        et.commit();

    }
}
