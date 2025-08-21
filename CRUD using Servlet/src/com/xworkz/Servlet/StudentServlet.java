package com.xworkz.Servlet;

import com.xworkz.DTO.Student;
import com.xworkz.service.StudentService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
    private StudentService service = new StudentService();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("action");
        try {
            if ("delete".equals(action)) {
                int id = Integer.parseInt(req.getParameter("id"));
                service.delete(id);
                resp.sendRedirect("StudentServlet");
            } else if ("edit".equals(action)) {
                int id = Integer.parseInt(req.getParameter("id"));
                Student student = service.getById(id);
                req.setAttribute("student", student);
                req.getRequestDispatcher("edit-student.jsp").forward(req, resp);
            } else {
                List<Student> students = service.listStudents();
                req.setAttribute("students", students);
                req.getRequestDispatcher("list-students.jsp").forward(req, resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idStr = req.getParameter("id");
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        Student s = new Student();
        s.setName(name);
        s.setEmail(email);

        try {
            if (idStr != null && !idStr.isEmpty()) {
                s.setId(Integer.parseInt(idStr));
                service.updateStudent(s);
            } else {
                service.addStudent(s);
            }
            resp.sendRedirect("StudentServlet");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}