package by.education;

import by.education.data.BlocksList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        List<String> players = BlocksList.players();
        List<String> ages = BlocksList.ages();
        List<String> countries = BlocksList.countries();

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
        );
        for (int i = 0; i < BlocksList.players().size(); i++) {
            writer.append("<tr>\n");
            writer.append("<td>").append(players.get(i)).append("</td>\n");
            writer.append("<td>").append(ages.get(i)).append("</td>\n");
            writer.append("<td>").append(countries.get(i)).append("</td>\n");
            writer.append("</tr>");
        }
        writer.append("""
                 </table>
                 </body>
                 </html>\
                """);
    }
}
