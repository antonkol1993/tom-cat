package by.education.servlets.current.persons;

import objects.Person;
import service.PersonService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListPersonServlet", urlPatterns = "/persons")
public class ListPersonServlet extends HttpServlet {

    private final PersonService personService = PersonService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Person> list;
        try {
            list = personService.getPersonList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        req.setAttribute("list", list);
        req.getRequestDispatcher("/persons/personsList.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }


}