package by.education.servlets.current.servlets;

import by.education.service.PlayerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "NewAddServlet", urlPatterns = "/players/add")
public class NewAddServlet extends HttpServlet {
    PlayerService playerService = PlayerService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("type", "Add");
        req.setAttribute("name", "");
        req.setAttribute("age", "");
        req.setAttribute("country", "");
        req.setAttribute("role", "");
        req.setAttribute("url", "/newAdd");
        req.getRequestDispatcher("current/formPlayers.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        Integer age = Integer.valueOf(req.getParameter("age"));
        String country = req.getParameter("country");
        String role = req.getParameter("role");
        playerService.addPlayer(name,age,country,role);
        resp.sendRedirect("newPlayers");
    }
}
