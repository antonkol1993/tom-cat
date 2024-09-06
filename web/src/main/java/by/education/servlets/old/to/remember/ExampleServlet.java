package by.education.servlets.old.to.remember;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "exampleServlet", urlPatterns = "/example")
public class ExampleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> days = List.of("Mon", "Tue", "Wed", "Thu", "Friday", "Sat", "Sun");
        req.setAttribute("days", days);
        req.getRequestDispatcher("example.jsp").forward(req, resp);
    }
}
