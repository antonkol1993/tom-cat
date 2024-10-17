package by.education.servlets.current.persons;

import by.education.service.PersonService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet( urlPatterns = "/persons/edit/*")
public class EditPersonServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();
        int personId = Integer.parseInt(pathInfo.substring(1));
        PersonService personService = PersonService.getInstance();
        int i = 0;
        while (i <personService.getPersonList().size()) {

            i++;
        }

        String servletPath = req.getServletPath();
        req.setAttribute("username", "");
        req.setAttribute("password", "");
        req.setAttribute("role", "");
        req.setAttribute("input", "Create");
        req.setAttribute("servletPath", servletPath);
        req.setAttribute("id", "");
        req.getRequestDispatcher("/persons/personsAdd.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PersonService personService = PersonService.getInstance();
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if (personService.isUniqueUser(username)) {
            personService.addPerson(username, password);
            resp.sendRedirect(req.getContextPath() + "/persons");
        } else {
            String servletPath = req.getServletPath();
            req.setAttribute("servletPath", servletPath);
            req.getRequestDispatcher("../informational/persons/userAlreadyExists.jsp").forward(req,resp);
        }


    }


}