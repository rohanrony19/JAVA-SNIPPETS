package com.xworkz.moon.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/Galaxy",loadOnStartup = 2)
public class SunServlet extends GenericServlet {

    public SunServlet(){
        System.out.println("SunServlet created by Tomcat");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running Service in sun servlet");


        String planet1= servletRequest.getParameter("planet1");
        System.out.println(planet1);

        String ref2= servletRequest.getParameter("planet2");
        System.out.println(ref2);

        String ref3= servletRequest.getParameter("planet3");
        System.out.println(ref3);

        String ref4= servletRequest.getParameter("planet4");
        System.out.println(ref4);

        String ref5= servletRequest.getParameter("planet5");
        System.out.println(ref5);

        String ref6= servletRequest.getParameter("planet6");
        System.out.println(ref6);

        String ref7= servletRequest.getParameter("planet7");
        System.out.println(ref7);

        String ref8= servletRequest.getParameter("planet8");
        System.out.println(ref8);

        String ref9= servletRequest.getParameter("planet9");
        System.out.println(ref9);
    }
}
