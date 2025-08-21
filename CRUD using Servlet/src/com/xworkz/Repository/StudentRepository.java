package com.xworkz.Repository;

import com.xworkz.DTO.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private Connection getConnection() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","");

    }

    public void save(Student student) throws Exception{
        Connection con = getConnection();
        PreparedStatement ps =  con.prepareStatement("INSERT INTO students(name,email) VALUES(?,?)");
        ps.setString(1,student.getName());
        ps.setString(2,student.getEmail());
        ps.executeUpdate();
        con.close();
    }

    public List<Student> getAll() throws Exception{
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("SELECT * FROM students");
        ResultSet rs = ps.executeQuery();
        List<Student> list = new ArrayList<>();
        while (rs.next()) {
            Student s = new Student();
            s.setId(rs.getInt("id"));
            s.setName(rs.getString("name"));
            s.setEmail(rs.getString("email"));
            list.add(s);
        }
        con.close();
        return list;
    }
    public void deleteById(int id) throws Exception {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("DELETE FROM students WHERE id = ?");
        ps.setInt(1, id);
        ps.executeUpdate();
        con.close();
    }

    public Student getById(int id) throws Exception {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("SELECT * FROM students WHERE id = ?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        Student s = new Student();
        if (rs.next()) {
            s.setId(rs.getInt("id"));
            s.setName(rs.getString("name"));
            s.setEmail(rs.getString("email"));
        }
        con.close();
        return s;
    }

    public void update(Student student) throws Exception {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("UPDATE students SET name = ?, email = ? WHERE id = ?");
        ps.setString(1, student.getName());
        ps.setString(2, student.getEmail());
        ps.setInt(3, student.getId());
        ps.executeUpdate();
        con.close();
    }


}
