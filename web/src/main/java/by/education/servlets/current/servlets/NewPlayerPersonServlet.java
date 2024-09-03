package by.education.servlets.current.servlets;

import by.education.service.PlayerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "NewPlayerPersonServlet", urlPatterns = "/newPlayer/*")
public class NewPlayerPersonServlet extends HttpServlet {
    private final PlayerService playerService = PlayerService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();
        String id = pathInfo.startsWith("/") ? pathInfo.substring(1) : pathInfo;
        System.out.println(id);
        if (!id.isEmpty()) {
//        req.getRequestDispatcher("/newPlayers").forward(req, resp);
            req.getRequestDispatcher("/current/newExample.jsp").forward(req, resp);
//            req.getRequestDispatcher("current/newExample.jsp").forward(req, resp);
        }
    }


}



