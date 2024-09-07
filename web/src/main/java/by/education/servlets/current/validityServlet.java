package by.education.servlets.current;

import by.education.service.PersonService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "validityServlet", urlPatterns = "/validity")
public class validityServlet extends HttpServlet {

    PersonService personService = PersonService.getInstance();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        boolean valid = personService.isValid(userName, password);
        // Person person = personService.get(userName, password)
        // person.role

        if(valid) {
            req.setAttribute("answer", "Succesful");
            req.getRequestDispatcher("/filter/answer.jsp").forward(req,resp);
            req.getSession().setAttribute("user", true);
        } else {
            req.setAttribute("answer", "Invalid login or password");
            req.getRequestDispatcher("/filter/answer.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    doGet(req, resp);
    }
}
