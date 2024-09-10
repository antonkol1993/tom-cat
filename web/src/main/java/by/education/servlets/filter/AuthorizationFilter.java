package by.education.servlets.filter;

import by.education.constants.UsersRole;
import by.education.data.Player;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

import static by.education.constants.Constants.USER;

@WebFilter(filterName = "AuthorizationFilter", urlPatterns = "/admin/*")
public class AuthorizationFilter implements Filter {


    private static final List<String> UNAUTHENTICATED_URLS =
            List.of("/persons");


    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpSession session = httpServletRequest.getSession();

        if (
                UNAUTHENTICATED_URLS.contains(httpServletRequest.getServletPath()) ||
                        session.getAttribute(USER) == UsersRole.ADMIN) {
            chain.doFilter(request, response);

        } else {
            int i = 400;
            ((HttpServletResponse) response).sendError(i);

        }


    }
}
