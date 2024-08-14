package by.education.servlets;

import by.education.data.Service;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ListPlayersServlet", urlPatterns = "/players")
public class ListPlayersServlet extends HttpServlet {
    private final Service player = Service.getInstance();
    private final int size = player.getList().size();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        Cookie cookie = new Cookie("Anton", "Java-developer");
        cookie.setComment("I love extra homework");
        cookie.setHttpOnly(true);
        resp.addCookie(cookie);
        resp.setContentType("text/html");
        resp.addHeader("Set-Cookie", "JSESSIONID=33F6FD3CE3CAAFBDB516FCB1956F5303; Path=/web; HttpOnly");

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

        for (int i = 0; i < size; i++) {
            String name = player.getList().get(i).getName();
            Integer age = player.getList().get(i).getAge();
            String country = player.getList().get(i).getCountry();

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