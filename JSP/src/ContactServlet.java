import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/contact" )
public class ContactServlet extends GenericServlet {

    public ContactServlet()
    {
        System.out.println("ContactServlet created by tomcat...");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse){
        System.out.println("running service in ContactServlet");
        System.out.println("extracting request parameters");
        String name = servletRequest.getParameter("name");
        String email = servletRequest.getParameter("email");
        String mobile = servletRequest.getParameter("mobile");
        String comments = servletRequest.getParameter("comments");

        RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("ContactResult.jsp")
        requestDispatcher.forward(servletRequest,servletResponse);

    }
}
