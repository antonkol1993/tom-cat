package by.education.servlets;

import by.education.data.Player;
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
import java.util.List;

import static java.lang.String.valueOf;

@WebServlet(name = "GetHeaderServlet", urlPatterns = "/newPlayerRead")
public class NewPlayerReadServlet extends HttpServlet {

    private final PlayerService playerService = PlayerService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Player> list = playerService.getList();
        String name;
        Integer age;
        String country;
        Integer id;
        for (int i = 0; i < list.size(); i++) {
            name = list.get(i).getName();
            age = list.get(i).getAge();
//            country = list.get(i).getCountry();
//            id = list.get(i).getId();
            req.setAttribute("list", list);
            req.setAttribute("name", name);
            req.setAttribute("age", age);
//            req.setAttribute("country", country);
//            req.setAttribute("id", id);
////            req.setAttribute("numbList",list.size());
        }

        req.getRequestDispatcher("newPlayersList.jsp").forward(req, resp);
        System.out.println(list);
    }
}