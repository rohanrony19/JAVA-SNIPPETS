package com.xworkz.Servlet;

import com.xworkz.DTO.JobDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/jobApllication",loadOnStartup = 1)
public class JobServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String email=req.getParameter("email");
        String mobile = req.getParameter("mobile");
        String city = req.getParameter("city");
        String type = req.getParameter("type");

        JobDTO jobDTO = new JobDTO();
        jobDTO.setName(name);
        jobDTO.setEmail(email);
        jobDTO.setMobile(Long.parseLong(mobile));
        jobDTO.setCity(city);
        jobDTO.setType(type);
        System.out.println(jobDTO);




    }
}
