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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String delete = req.getParameter("delete");
        String edit = req.getParameter("edit");
        String add = req.getParameter("add");
        req.getRequestDispatcher("/player/editPlayer.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String delete = req.getParameter("delete");
        String edit = req.getParameter("edit");
        String add = req.getParameter("add");

        if (!Objects.equals(delete, null)) {
            req.getRequestDispatcher("/remove").forward(req, resp);
        }
        if (!Objects.equals(edit, null)) {
            req.getRequestDispatcher("/player/editPlayer.jsp").forward(req, resp);
        }
        if (!Objects.equals(add, null)) {
            req.getRequestDispatcher("/player/addPlayer.jsp").forward(req, resp);
        }

    }
}
