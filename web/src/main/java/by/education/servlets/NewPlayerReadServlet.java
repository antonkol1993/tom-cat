package by.education.servlets;

import by.education.data.Player;
import by.education.service.PlayerService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static java.lang.String.valueOf;

@WebServlet(name = "GetHeaderServlet", urlPatterns = "/newPlayerRead")
public class NewPlayerReadServlet extends HttpServlet {

    private final PlayerService playerService = PlayerService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Player> list = playerService.getPlayerList();

        req.setAttribute("list", list);
        req.setAttribute("somePlayer", list.get(2));
        req.getRequestDispatcher("player/newPlayersList.jsp").forward(req, resp);
    }

//    @Override
//    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        doPost(req, resp);
//    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String contextPath = req.getContextPath(); ///newPlayerRead/{id}
        //  str a = {id} to integer
//        resp.sendError(400);
        String name = req.getParameter("name");
        Integer age = Integer.parseInt(req.getParameter("age"));
        String country = req.getParameter("country");
        Integer id = Integer.parseInt(req.getParameter("id"));

        playerService.addPlayer(new Player(name,age,country,id));
        doGet(req, resp);
//        List<Player> list = playerService.getPlayerList();
//        req.setAttribute("list", list);
//        req.getRequestDispatcher("newPlayersList.jsp").forward(req, resp);
    }


}