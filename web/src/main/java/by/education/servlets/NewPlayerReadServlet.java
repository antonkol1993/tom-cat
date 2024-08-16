package by.education.servlets;

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

@WebServlet(name = "GetHeaderServlet", urlPatterns = "/newPlayerRead")
public class NewPlayerReadServlet extends HttpServlet {

    private final PlayerService playerService = PlayerService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Enumeration<String> headerNames = req.getHeaderNames();
        for (Iterator<String> it = headerNames.asIterator(); it.hasNext(); ) {
            String headerName = it.next();
            String headerValue = req.getHeader(headerName);

            System.out.print(headerName);
            System.out.print(" :     ");
            System.out.println(headerValue);

        }

        Cookie cookie = new Cookie("Anton", "Java-developer");
        cookie.setComment("I love extra homework");
        cookie.setHttpOnly(true);
        resp.addCookie(cookie);
        req.getRequestDispatcher("/enterPlayer.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.addHeader("Content-Type", "text/html");
        String player = req.getParameter("player");
        String age = req.getParameter("age");
        String country = req.getParameter("country");

//        Player player1 = new Player(player, Integer.valueOf(age), country);
//
//        playerService.getList().add(player1);
//        playerService.addPlayer(player1);
//        playerService.addPlayer(player, Integer.valueOf(age), country);
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.write("""
                <html>
                <body>
                """
                + player + " " + age + " " + country + " " +
                """
                </body>
                </html>
                """);
    }
}
