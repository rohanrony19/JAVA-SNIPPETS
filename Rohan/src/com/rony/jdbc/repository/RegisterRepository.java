package com.rony.jdbc.repository;

import com.rony.jdbc.dto.Logindto;
import com.rony.jdbc.dto.Registerdto;

public interface RegisterRepository {

    void save(Registerdto registerdto);
}
