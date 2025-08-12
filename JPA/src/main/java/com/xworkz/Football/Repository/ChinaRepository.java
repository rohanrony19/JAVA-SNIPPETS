package com.xworkz.Football.Repository;

import com.xworkz.Football.Entity.ChinaEntity;

public interface ChinaRepository {
    boolean save(ChinaEntity chinaEntity);
    int getById(int id);
    String update(int id,String cities);
    boolean remove(int id);

}
