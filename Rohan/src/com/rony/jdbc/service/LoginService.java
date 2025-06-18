package com.rony.jdbc.service;

import com.rony.jdbc.dto.Logindto;

public interface LoginService {
    String validate(Logindto logindto);
}
