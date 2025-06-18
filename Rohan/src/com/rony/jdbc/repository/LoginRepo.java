package com.rony.jdbc.repository;

import com.rony.jdbc.dto.Logindto;

public interface LoginRepo {
    void save(Logindto logindto);
}
