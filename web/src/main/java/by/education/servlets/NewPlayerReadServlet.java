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


}