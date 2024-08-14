package by.education.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet(name = "GetHeaderServlet", urlPatterns = "/getHeader")
public class GetHeaderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       req.getRequestDispatcher("/headers.jsp").forward(req, resp);

        Cookie cookie = new Cookie("Anton", "Java-developer");
        cookie.setComment("I love extra homework");
        cookie.setHttpOnly(true);
        resp.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String header = String.valueOf(req.getHeader("1"));
        String cookie = Arrays.toString(req.getCookies());


        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.write("""
                <html>
                <body>
                """
                + header + cookie +
                """
                </body>
                </html>
                """);
    }
}
