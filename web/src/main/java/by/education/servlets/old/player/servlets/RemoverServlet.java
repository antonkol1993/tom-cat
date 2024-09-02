package by.education.servlets.old.player.servlets;

import by.education.service.PlayerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="RemoverServlet", urlPatterns = "/remove")
public class RemoverServlet extends HttpServlet {
    PlayerService playerService = PlayerService.getInstance();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        playerService.deletePlayer(Integer.valueOf(req.getParameter("delete")));
        req.getRequestDispatcher("listServlet").forward(req,resp);

    }

}
