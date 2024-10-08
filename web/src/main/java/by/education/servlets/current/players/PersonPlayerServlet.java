package by.education.servlets.current.players;

import by.education.service.PlayerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PersonPlayerServlet", urlPatterns = "/players/*")
public class PersonPlayerServlet extends HttpServlet {
    private final PlayerService playerService = PlayerService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();
        Integer id = Integer.valueOf(pathInfo.startsWith("/") ? pathInfo.substring(1) : pathInfo);
        System.out.println(id);
        try {
            for (int i = 0; i < playerService.getPlayerList().size(); i++) {
                if (id.equals(playerService.getPlayerList().get(i).getId())) {
                    req.setAttribute("ref", playerService.getPlayerList().get(i));
                    req.setAttribute("name", playerService.getPlayerList().get(i).getName());
                    req.setAttribute("age", playerService.getPlayerList().get(i).getAge());
                    req.setAttribute("country", playerService.getPlayerList().get(i).getCountry());
                    req.setAttribute("pos", playerService.getPlayerList().get(i).getPosition());
                    req.setAttribute("id", playerService.getPlayerList().get(i).getId());
                    req.getRequestDispatcher("/players/playersPersonInfo.jsp").forward(req, resp);
                }
            }
        } catch (Exception e){
            throw new RuntimeException(e);
        }

    }


}



