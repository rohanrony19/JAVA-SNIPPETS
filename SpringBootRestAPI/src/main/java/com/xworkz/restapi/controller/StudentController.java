package com.xworkz.restapi.controller;

import com.xworkz.restapi.entity.StudentEntity;
import com.xworkz.restapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepository repository;
    //get all the students
    //localhost:8080/students
    @GetMapping("/students")
    public List<StudentEntity> getAllStudents(){
        List<StudentEntity> students = repository.findAll();
        return students;
    }

    //localhost:8080/students/1
    @GetMapping("students/{id}")
    public StudentEntity getStudent(@PathVariable int id){
        StudentEntity Student = repository.findById(id).get();
        return Student;
    }

    @PostMapping("/student/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createStudent(@RequestBody StudentEntity student){
        repository.save(student);
    }

    @PutMapping("/student/update/id/{id}")
    public StudentEntity updateById(@PathVariable int id){
        StudentEntity student = repository.findById(id).get();
        student.setName("Poonam");
        student.setPercentage(42);
        repository.save(student);
        return student;
    }

    @PutMapping("/student/update/name/{name}")
    public StudentEntity updateStudents(@PathVariable("name") String name){
        StudentEntity student = repository.findByName(name);
        if(student == null){
            throw new RuntimeException("Student Not found with name"+name);
        }
        if(name.equals("Raji")) {
            student.setPercentage(72);
        }

        return repository.save(student);
    }

    @DeleteMapping("/student/delete/id/{id}")
    public StudentEntity deleteById(@PathVariable int id){
        StudentEntity Student = repository.findById(id).get();
        repository.delete(Student);
        return Student;
    }
}
