package by.education.servlets;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/login.jsp").forward(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String player = request.getParameter("player");
        String age = request.getParameter("age");
        String country = request.getParameter("country");


        request.getSession().getAttribute("add");
        ServletContext servletContext = request.getServletContext();
        String rere = servletContext.getInitParameter("rere");

        String header = request.getHeader("User-Agent");
//Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36
//Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36 OPR/112.0.0.0 (Edition Yx 03)

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        if (header.contains("OPR")) {
            writer.write("""
                <html>
                <body>
                <h2>Opera is not supported</h2>
                </body>
                </html>
                """);
            return;
        }

        writer.write("""
                <html>
                <body>
                <h2>Login Page</h2>
                """ +
                "<p>Player is <b>" + player + "</b>. His age is <b>" + age + "</b> Country is <b>" + country + "</b></p>" +
                //header
                // cookie
                """  
                </body>
                </html>
                """);

    }
}
