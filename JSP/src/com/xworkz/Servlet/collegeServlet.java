package com.xworkz.Servlet;

import com.xworkz.dto.collegedto;
import com.xworkz.service.collegeApplicationImp;
import com.xworkz.service.collegeApplicationService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/College" ,loadOnStartup = 1)
public class collegeServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fullName=req.getParameter("fullName");
        String fatherName=req.getParameter("fatherName");
        String motherName=req.getParameter("motherName");
        String email=req.getParameter("email");
        String mobile=req.getParameter("mobile");
        String previouscol=req.getParameter("previouscol");
        String obtainedMarks=req.getParameter("obtainedMarks");
        String city=req.getParameter("city");
        String state=req.getParameter("state");

        //collegedto coldto = new collegedto(fullName,fatherName,motherName,email,mobile,Long.parseLong(previouscol),obtainedMarks,city,state);
        collegedto coldto = new collegedto();
        coldto.setFullName(fullName);
        coldto.setFatherName(fatherName);
        coldto.setMotherName(motherName);  
        coldto.setEmail(email);
        coldto.setMobile(Long.parseLong(mobile));
        coldto.setPreviouscol(previouscol);
        coldto.setObtainedMarks(obtainedMarks);
        coldto.setCity(city);
        coldto.setState(state);
        System.out.println(coldto);

        collegeApplicationService collegeapplicationservice = new collegeApplicationImp();
        collegeapplicationservice.collegeApplicationValidated(coldto);

    }
}
