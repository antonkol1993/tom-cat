package by.education.servlets;

import by.education.data.Player;
import by.education.service.PlayerService;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import static java.lang.String.valueOf;

@WebServlet(name = "GetHeaderServlet", urlPatterns = "/newPlayerRead")
public class NewPlayerReadServlet extends HttpServlet {

    private final PlayerService playerService = PlayerService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Player> list = playerService.getList();

        req.setAttribute("list", list);
        req.getRequestDispatcher("newPlayersList.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        Integer age = Integer.parseInt(req.getParameter("age"));
        String country = req.getParameter("country");
        Integer id = Integer.parseInt(req.getParameter("id"));

        playerService.addPlayer(new Player(name,age,country,id));
        List<Player> list = playerService.getList();
        req.setAttribute("list", list);
        req.getRequestDispatcher("newPlayersList.jsp").forward(req, resp);
    }
}