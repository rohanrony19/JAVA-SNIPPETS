package com.rony.jdbc.service;

import com.rony.jdbc.dto.Registerdto;

import java.sql.SQLException;

public interface RegisterService {
    String validate(Registerdto registerdto);
}
