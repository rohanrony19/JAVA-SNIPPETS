package com.xworkz.restapi.repository;

import com.xworkz.restapi.controller.StudentController;
import com.xworkz.restapi.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity,Integer> {
    StudentEntity findByName(String name);
}
