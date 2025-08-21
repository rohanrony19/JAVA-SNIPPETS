package com.xworkz.service;

import com.xworkz.DTO.Student;
import com.xworkz.Repository.StudentRepository;

import java.util.List;

public class StudentService {
    private StudentRepository repo = new StudentRepository();


    public void addStudent(Student s) throws Exception {
        repo.save(s);
    }

    public List<Student> listStudents() throws Exception {
        return repo.getAll();
    }

    public Student getById(int id) throws Exception {
        return repo.getById(id);
    }

    public void updateStudent(Student s) throws Exception {
        repo.update(s);
    }

    public void delete(int id) throws Exception {
        repo.deleteById(id);
    }
}