package main.java.com.bookstore.servlet;

import main.java.com.bookstore.model.Book;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class BookListServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        BookDAO dao = new BookDAO();
        List<Book> books = dao.getAll();

        req.setAttribute("books", books);
        req.getRequestDispatcher("/pages/books.jsp").forward(req, res);
    }
}