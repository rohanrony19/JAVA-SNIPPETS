package com.xworkz.rohan.repository;

import com.xworkz.rohan.entity.RegisterEntity;

public interface RegisterRepository {
    boolean save(RegisterEntity entity);

    RegisterEntity find(String name);

    RegisterEntity findByEmail(String email);

    boolean updatePassword(String email, String password);

    boolean updateProfile(RegisterEntity register);

    void updateTable(RegisterEntity entity);
}
