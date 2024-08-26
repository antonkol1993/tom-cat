package by.education.servlets;

import by.education.data.Player;
import by.education.service.PlayerService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ListPlayersServlet", urlPatterns = "/players")
public class ListPlayersServlet extends HttpServlet {
    private final PlayerService playerService = PlayerService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        Cookie cookie = new Cookie("Anton", "Java-developer");
        cookie.setComment("I love extra homework");
        cookie.setHttpOnly(true);
        resp.addCookie(cookie);
        resp.setContentType("text/html");
        resp.addHeader("Set-Cookie", "JSESSIONID=33F6FD3CE3CAAFBDB516FCB1956F5303; Path=/web; HttpOnly");

//        req.setAttribute("playerList", new ArrayList<Player>());
        PrintWriter writer = resp.getWriter();
        writer.write(
                """
                        <!DOCTYPE html>
                        <html>
                        <head>
                        <style>
                        table {
                          font-family: arial, sans-serif;
                          border-collapse: collapse;
                          width: 100%;
                        }
                                      \s
                        td, th {
                          border: 1px solid #dddddd;
                          text-align: left;
                          padding: 8px;
                        }
                                       \s
                        tr:nth-child(even) {
                          background-color: #dddddd;
                        }
                        </style>
                        </head>
                        <body>
                                       \s
                        <h2>HTML Table</h2>
                                       \s
                        <table>
                          <tr>
                            <th>Player</th>
                            <th>Age</th>
                            <th>Country</th>
                          </tr>
                         \s"""
        );

        List<Player> playerList = playerService.getPlayerList();
        for (Player player : playerList) {
            String name = player.getName();
            Integer age = player.getAge();
            String country = player.getCountry();
//            writer.println()
            writer.append("<tr>\n");
            writer.append("<td>").append(name).append("</td>\n");
            writer.append("<td>").append(String.valueOf(age)).append("</td>\n");
            writer.append("<td>").append(country).append("</td>\n");
            writer.append("</tr>");
        }
        writer.append("""
                 </table>
                 </body>
                 </html>\
                """);
    }
}
