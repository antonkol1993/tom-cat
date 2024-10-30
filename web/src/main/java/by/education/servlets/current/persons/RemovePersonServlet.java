package by.education.servlets.current.persons;

import service.PersonService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet( urlPatterns = "/persons/remove/*")
public class RemovePersonServlet extends HttpServlet {

    private final PersonService personService = PersonService.getInstance();

    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();
        int id = Integer.parseInt(pathInfo.substring(1));
        personService.removePerson(id);
        resp.sendRedirect(req.getContextPath() + "/persons");
    }


}