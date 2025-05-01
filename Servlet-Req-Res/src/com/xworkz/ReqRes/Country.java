package com.xworkz.ReqRes;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/Country",loadOnStartup = 5)
public class Country extends GenericServlet {

    public Country() {
        System.out.println("Country created by Tomcat");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service in Country");

        String ref1 = servletRequest.getParameter("name");
        System.out.println("name: " + ref1);

        String ref2 = servletRequest.getParameter("monument");
        System.out.println("monument: " + ref2);

        String ref3 = servletRequest.getParameter("location1");
        System.out.println("location1: " + ref3);

        String ref4 = servletRequest.getParameter("festival");
        System.out.println("festival: " + ref4);

        String ref5 = servletRequest.getParameter("month");
        System.out.println("month: " + ref5);

        String ref6 = servletRequest.getParameter("sport");
        System.out.println("sport: " + ref6);

        String ref7 = servletRequest.getParameter("popularity");
        System.out.println("popularity: " + ref7);

        String ref8 = servletRequest.getParameter("medicine");
        System.out.println("medicine: " + ref8);

        String ref9 = servletRequest.getParameter("origin");
        System.out.println("origin: " + ref9);

        String ref10 = servletRequest.getParameter("filmIndustry");
        System.out.println("filmIndustry: " + ref10);

        String ref11 = servletRequest.getParameter("center");
        System.out.println("center: " + ref11);

        String ref12 = servletRequest.getParameter("capital");
        System.out.println("capital: " + ref12);

        String ref13 = servletRequest.getParameter("region");
        System.out.println("region: " + ref13);
    }
}
