package com.xworkz.jdbc.servlet;

import com.xworkz.jdbc.dto.PatientDTO;
import com.xworkz.jdbc.service.PatientService;
import com.xworkz.jdbc.service.PatientServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Patient")
public class Patientinfo extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fullname=req.getParameter("fullName");
        String appointment=req.getParameter("appointment");
        String bloodgroup=req.getParameter("bloodgroup");
        int age=Integer.parseInt(req.getParameter("age"));
        String gender=req.getParameter("gender");
        String Appointmentfor=req.getParameter("Appointmentfor");
        String email=req.getParameter("email");
        long mobile=Long.parseLong(req.getParameter("mobile"));

        PatientDTO patientDTO=new PatientDTO(fullname,appointment,bloodgroup,age,gender,Appointmentfor,email,mobile);
        PatientService patientService=new PatientServiceImpl();
        patientService.validate(patientDTO);

        System.out.println(patientDTO);
    }
}
