package by.education;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyHelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
                                        
                        td, th {
                          border: 1px solid #dddddd;
                          text-align: left;
                          padding: 8px;
                        }
                                        
                        tr:nth-child(even) {
                          background-color: #dddddd;
                        }
                        </style>
                        </head>
                        <body>
                                        
                        <h2>HTML Table</h2>
                                        
                        <table>
                          <tr>
                            <th>Player</th>
                            <th>Age</th>
                            <th>Country</th>
                          </tr>
                          """

//                        for(int i = 0, i  )
//                          <tr>
//                            <td>Alfreds Futterkiste</td>
//                            <td>Maria Anders</td>
//                            <td>Germany</td>
//                          </tr>
//                          <tr>
//                            <td>Centro comercial Moctezuma</td>
//                            <td>Francisco Chang</td>
//                            <td>Mexico</td>
//                          </tr>
//                          <tr>
//                            <td>Ernst Handel</td>
//                            <td>Roland Mendel</td>
//                            <td>Austria</td>
//                          </tr>
//                          <tr>
//                            <td>Island Trading</td>
//                            <td>Helen Bennett</td>
//                            <td>UK</td>
//                          </tr>
//                          <tr>
//                            <td>Laughing Bacchus Winecellars</td>
//                            <td>Yoshi Tannamuri</td>
//                            <td>Canada</td>
//                          </tr>
//                          <tr>
//                            <td>Magazzini Alimentari Riuniti</td>
//                            <td>Giovanni Rovelli</td>
//                            <td>Italy</td>
//                          </tr>
//                          <tr>
//                            <td>M Group trade</td>
//                            <td>Antonio</td>
//                            <td>Belarus</td>
//                          </tr>
//                          <tr>
//                            <td>Objectstyle LLC</td>
//                            <td>Andy</td>
//                            <td>Belarus</td>
//                          </tr>
//                        </table>
//
//                        </body>
//                        </html>
//                """);
        );
    }
}
