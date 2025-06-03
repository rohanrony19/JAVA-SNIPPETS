package com.xworkz.ReqRes;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/Bike",loadOnStartup = 6)
public class Bike extends GenericServlet {

    public Bike() {
        System.out.println("Bike created by Tomcat");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service in Bike");

        String ref1 = servletRequest.getParameter("brand");
        System.out.println("brand: " + ref1);

        String ref2 = servletRequest.getParameter("model");
        System.out.println("model: " + ref2);

        String ref3 = servletRequest.getParameter("engine");
        System.out.println("engine: " + ref3);

        String ref4 = servletRequest.getParameter("type");
        System.out.println("type: " + ref4);

        String ref5 = servletRequest.getParameter("milage");
        System.out.println("milage: " + ref5);

        String ref6 = servletRequest.getParameter("color");
        System.out.println("color: " + ref6);

        String ref7 = servletRequest.getParameter("brakes");
        System.out.println("brakes: " + ref7);
  
        String ref8 = servletRequest.getParameter("price");
        System.out.println("price: " + ref8);

        String ref9 = servletRequest.getParameter("topSpeed");
        System.out.println("topSpeed: " + ref9);

        String ref10 = servletRequest.getParameter("filmIndustry");
        System.out.println("filmIndustry: " + ref10);

        String ref11 = servletRequest.getParameter("warranty");
        System.out.println("warranty: " + ref11);

        String ref12 = servletRequest.getParameter("fuelCapacity");
        System.out.println("fuelCapacity: " + ref12);

        String ref13 = servletRequest.getParameter("weight");
        System.out.println("weight: " + ref13);

        String ref14 = servletRequest.getParameter("feature1");
        System.out.println("feature1: " + ref14);

        String ref15 = servletRequest.getParameter("feature2");
        System.out.println("feature2: " + ref15);
    }
}

