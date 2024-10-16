package by.education.servlets.current.persons;

import by.education.constants.UsersRole;
import by.education.objects.Person;
import by.education.service.PersonService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/person/*")
public class PersonalPagePersonServlet extends HttpServlet {
    List<Person> personList = PersonService.getInstance().getPersonList();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int personId = Integer.parseInt(req.getPathInfo().startsWith("/") ?
                req.getPathInfo().substring(1) : req.getPathInfo());
        System.out.println(personId);
        Person person = personList.get(personId);
        int id = person.getId();
        String name = person.getUserName();
        String password = person.getPassword();
        UsersRole role = person.getUserRole();
        req.setAttribute( "id", id);
        req.setAttribute( "name", name);
        req.setAttribute( "password", password);
        req.setAttribute( "role", role);
        req.getRequestDispatcher("/persons/personsPersonInfo.jsp").forward(req,resp);
    }

}
