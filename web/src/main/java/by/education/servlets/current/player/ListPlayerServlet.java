package by.education.servlets.current.player;

import by.education.data.Player;
import by.education.service.PlayerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListPlayerServlet", urlPatterns = "/new/players")
public class ListPlayerServlet extends HttpServlet {

    private final PlayerService playerService = PlayerService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Player> list = playerService.getPlayerList();

        req.setAttribute("list", list);
        req.getRequestDispatcher("/current/newPlayersList.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }


}