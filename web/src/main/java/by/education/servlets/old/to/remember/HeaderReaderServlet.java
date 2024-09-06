package by.education.servlets.old.to.remember;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;

@WebServlet(name = "HeaderReaderServlet", urlPatterns = "/header")
public class HeaderReaderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");
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

        Enumeration<String> headerNames = req.getHeaderNames();
        int i = 0;
        for (Iterator<String> list = headerNames.asIterator(); list.hasNext(); i++) {
            String headerName = list.next();
            String headerValue = req.getHeader(headerName);
//            System.out.println(i + "." + headerName + ": " + headerValue + ";");

            writer.append(String.valueOf(i)).append(".").append(headerName)
                    .append(": ").append(headerValue).append(";<br>");
        }
        writer.append("""
                 </table>
                 </body>
                 </html>\
                """);


    }
}
