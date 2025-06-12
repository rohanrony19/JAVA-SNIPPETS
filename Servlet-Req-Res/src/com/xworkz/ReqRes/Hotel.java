package com.xworkz.ReqRes;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/Hotel",loadOnStartup = 2)
public class Hotel extends GenericServlet {

    public Hotel(){
        System.out.println("Hotel created by Tomcat");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service in Hotel");

        String ref1 = servletRequest.getParameter("name");
        System.out.println("name: "+ref1);

        String ref2 = servletRequest.getParameter("location");
        System.out.println("location: "+ref2);

        String ref3 = servletRequest.getParameter("pricing");
        System.out.println("pricing: "+ref3);

        String ref4 = servletRequest.getParameter("drinks");
        System.out.println("drinks: "+ref4);

        String ref5 = servletRequest.getParameter("rating");
        System.out.println("rating:"+ref5);

        String ref6 = servletRequest.getParameter("visits");
        System.out.println("visits: "+ref6);

        String ref7 = servletRequest.getParameter("views");
        System.out.println("views: " +ref7);

       PrintWriter printWriter= servletResponse.getWriter();
        printWriter.write("<html>");
        printWriter.write("<body>");
        printWriter.write("<h1>");
        printWriter.write("Hotel info send success...");

        printWriter.write("</h1>");

        printWriter.write("</body>");

        printWriter.write("</html>");

    }
}
