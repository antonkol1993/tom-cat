package by.education.servlets.current.player;

import by.education.service.PlayerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "NewAddServlet", urlPatterns = "/players/add")
public class AddServlet extends HttpServlet {
    PlayerService playerService = PlayerService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("name", "");
        req.setAttribute("age", "");
        req.setAttribute("country", "");
        req.setAttribute("role", "");
        req.setAttribute("input", "Create");
        req.setAttribute("url", "/players/add");
        req.getRequestDispatcher("/current/add.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        Integer age = Integer.valueOf(req.getParameter("age"));
        String country = req.getParameter("country");
        String role = req.getParameter("role");
        playerService.addPlayer(name,age,country,role);
        req.getRequestDispatcher("/new/players").forward(req,resp);
    }
}
