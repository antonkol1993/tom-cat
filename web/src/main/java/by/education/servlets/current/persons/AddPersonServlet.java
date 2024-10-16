package by.education.servlets.current.persons;

import by.education.objects.Person;
import by.education.service.PersonService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet( urlPatterns = "/persons/add")
public class AddPersonServlet extends HttpServlet {

    private final PersonService personService = PersonService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String servletPath = req.getServletPath();
        req.setAttribute("userName", "");
        req.setAttribute("password", "");
        req.setAttribute("role", "");
        req.setAttribute("input", "Create");
        req.setAttribute("servletPath", servletPath);
        req.getRequestDispatcher("/persons/personsAdd").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }


}