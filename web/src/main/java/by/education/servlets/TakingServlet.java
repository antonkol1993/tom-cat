package by.education.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@WebServlet(name = "TakingServlet", urlPatterns = "/taking")
public class TakingServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String delete = req.getParameter("delete");
        String id = req.getParameter("id");
        String add = req.getParameter("add");

        if (!Objects.equals(delete, null)) {
            req.getRequestDispatcher("/remove").forward(req, resp);
        } else if (!Objects.equals(id, null)) {
            Integer reqID = Integer.parseInt(req.getParameter("id"));
            req.setAttribute("id", reqID);
            System.out.println(req.getParameter("id"));
            req.getRequestDispatcher("/player/editPlayer.jsp").forward(req, resp);
        } else if (!Objects.equals(add, null)) {
            req.getRequestDispatcher("/player/addPlayer.jsp").forward(req, resp);
        }
    }
}
