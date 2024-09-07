package by.education.servlets.current.player;

import by.education.service.PlayerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "NewRemoverServlet", urlPatterns = "/new/players/delete/*")
public class RemoverServlet extends HttpServlet {
    PlayerService playerService = PlayerService.getInstance();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();
        Integer id = Integer.valueOf(pathInfo.startsWith("/") ? pathInfo.substring(1) : pathInfo);
        playerService.deletePlayer(id);
//
//        List<Player> list = playerService.getPlayerList();
//        req.setAttribute("list", list);
        req.getRequestDispatcher("/new/players").forward(req,resp);

    }

}
