package by.education.servlets.current.player;

import by.education.data.Player;
import by.education.service.PlayerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EditServlet", urlPatterns = "/new/players/edit/*")
public class EditServlet extends HttpServlet {
    PlayerService playerService = PlayerService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();
        int id = Integer.parseInt(pathInfo.substring(1));
        for (int i = 0; i < playerService.getPlayerList().size(); i++) {
            if (playerService.getPlayerList().get(i).getId() == id) {
                Player player = playerService.getPlayerList().get(i);
                req.setAttribute("name", player.getName());
                req.setAttribute("age", player.getAge());
                req.setAttribute("country", player.getCountry());
                req.setAttribute("role", player.getPosition());
                req.setAttribute("input", "Edit");
                req.setAttribute("url", "/new/players/edit/");
                req.setAttribute("id", id);
            }
        }
        req.getRequestDispatcher("/current/edit.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        Integer age = Integer.valueOf(req.getParameter("age"));
        String country = req.getParameter("country");
        String role = req.getParameter("role");
        playerService.editPlayer(id, name, age, country, role);
        resp.sendRedirect(req.getContextPath() + "/new/players");
    }
}
