package com.xworkz.CRUD.servlet;

import com.xworkz.CRUD.dto.RegisterDTO;
import com.xworkz.CRUD.service.RegisterService;
import com.xworkz.CRUD.service.RegisterSeviceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/RegisterForm")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("working servlet in get method");
        RequestDispatcher requestDispatcher= req.getRequestDispatcher("Register.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("working servlet in post method");
        //form data extract
        String firstName=req.getParameter("firstName");
        String lastName=req.getParameter("lastName");
        String email=req.getParameter("email");
        String city=req.getParameter("city");
        String pincode=req.getParameter("pincode");
        int convertedPinCode=Integer.parseInt(pincode);

       System.out.println("name"+firstName+"lastname"+lastName+"email"+email+"city"+city+"pincode"+pincode);
        //passing to dto
        RegisterDTO registerDTO=new RegisterDTO();

        registerDTO.setFirstName(firstName);
        registerDTO.setLastName(lastName);
        registerDTO.setEmail(email);
        registerDTO.setPinCode(convertedPinCode);
        registerDTO.setCity(city);
        RegisterService registerService=new RegisterSeviceImpl();

       boolean result= registerService.validate(registerDTO);
        System.out.println(result);
        String error="name is not valid";
if (result){
    RequestDispatcher requestDispatcher= req.getRequestDispatcher("home.jsp");
    requestDispatcher.forward(req,resp);
}
else {
    req.setAttribute("error",error);
    RequestDispatcher requestDispatcher= req.getRequestDispatcher("Register.jsp");
    requestDispatcher.forward(req,resp);
}


    }
}
