package by.education.servlets.old;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet(name = "CookieReaderServlet", urlPatterns = "/cookie")
public class CookieReaderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();


        String string = Arrays.toString(req.getCookies());

        resp.setContentType("text/html");
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
                        <h2>Header list</h2>
                                       \s
                        <table>
                                             
                         \s"""
        );
        for (int i = 0; i < cookies.length; i++) {
            Cookie cookie = cookies[i];
            String name = cookie.getName();

            System.out.println(i + 1 + "." + name);
            writer.append(String.valueOf(i + 1)).append(".").append(name).append("<br>");
        }
        writer.append("""
                 </table>
                 </body>
                 </html>\
                """);


    }
}
