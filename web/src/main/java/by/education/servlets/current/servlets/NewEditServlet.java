package by.education.servlets.current.servlets;

import by.education.service.PlayerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "NewEditServlet", urlPatterns = "/newEdit/*")
public class NewEditServlet extends HttpServlet {
    PlayerService playerService = PlayerService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();
        String id = pathInfo.startsWith("/") ? pathInfo.substring(1) : pathInfo;
        for (int i = 0; i < playerService.getPlayerList().size(); i++) {
            if(playerService.getPlayerList().get(i).getId().equals(id)) {
                req.setAttribute("type", "Edit");
                req.setAttribute("name", playerService.getPlayerList().get(i).getName());
                req.setAttribute("age", String.valueOf(playerService.getPlayerList().get(i).getAge()));
                req.setAttribute("country", playerService.getPlayerList().get(i).getCountry());
                req.setAttribute("role", playerService.getPlayerList().get(i).getPosition());
                req.setAttribute("url", "/newEdit");
                break;
            }
        }

        req.getRequestDispatcher("/current/formPlayers.jsp").forward(req,resp);
    }

//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String name = req.getParameter("name");
//        Integer age = Integer.valueOf(req.getParameter("age"));
//        String country = req.getParameter("country");
//        String role = req.getParameter("role");
//        playerService.addPlayer(name,age,country,role);
//        resp.sendRedirect("newPlayers");
//    }
}
