package by.education.servlets.admins;

import by.education.data.objects.Person;
import by.education.service.PersonService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet (urlPatterns = "/admin/persons")
public class adminListOfPersonsServlet extends HttpServlet {
    List<Person> personList = PersonService.getInstance().getPersonList();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("personList", personList);
        req.getRequestDispatcher("/admin/adminPersons.jsp").forward(req, resp);
//        req.getRequestDispatcher("/admin/adminFormOfPersons.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
