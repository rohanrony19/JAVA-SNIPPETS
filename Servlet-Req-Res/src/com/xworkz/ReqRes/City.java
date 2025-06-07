package com.xworkz.ReqRes;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/City",loadOnStartup = 8)
public class City extends GenericServlet {

    public City() {
        System.out.println("City created by Tomcat");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service in City");

        String ref1 = servletRequest.getParameter("name");
        System.out.println("name: " + ref1);

        String ref2 = servletRequest.getParameter("state");
        System.out.println("state: " + ref2);

        String ref3 = servletRequest.getParameter("population");
        System.out.println("population: " + ref3);

        String ref4 = servletRequest.getParameter("area");
        System.out.println("area: " + ref4);

        String ref5 = servletRequest.getParameter("language");
        System.out.println("language: " + ref5);

        String ref6 = servletRequest.getParameter("nickname");
        System.out.println("nickname: " + ref6);

        String ref7 = servletRequest.getParameter("weather");
        System.out.println("weather: " + ref7);

        String ref8 = servletRequest.getParameter("famousFor");
        System.out.println("famousFor: " + ref8);

        String ref9 = servletRequest.getParameter("airport");
        System.out.println("airport: " + ref9);

        String ref10 = servletRequest.getParameter("metro");
        System.out.println("metro: " + ref10);

        String ref11 = servletRequest.getParameter("parks");
        System.out.println("parks: " + ref11);

        String ref12 = servletRequest.getParameter("education");
        System.out.println("education: " + ref12);

        String ref13 = servletRequest.getParameter("companies");
        System.out.println("companies: " + ref13);

        String ref14 = servletRequest.getParameter("touristSpots");
        System.out.println("touristSpots: " + ref14);

        String ref15 = servletRequest.getParameter("food");
        System.out.println("food: " + ref15);

        String ref16 = servletRequest.getParameter("sports");
        System.out.println("sports: " + ref16);

        String ref17 = servletRequest.getParameter("culture");
        System.out.println("culture: " + ref17);

        PrintWriter printWriter= servletResponse.getWriter();
        printWriter.write("<html>");
        printWriter.write("<body>");
        printWriter.write("<h1>");
        printWriter.write("City info send success...");
    
        printWriter.write("</h1>");

        printWriter.write("</body>");

        printWriter.write("</html>");

    }
}

