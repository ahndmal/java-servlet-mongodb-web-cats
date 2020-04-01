package com.anma.servlets;

//import com.beastiehut.services.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
//    private LoginService service = new LoginService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   throws IOException, ServletException {

        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws IOException, ServletException {

        String name = request.getParameter("name");
        String password = request.getParameter("password");

//        boolean isValidUser = service.validateUser(name, password);

//        if (isValidUser) {
//
//            request.getSession().setAttribute("name", name);
//            request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
////            response.sendRedirect("/WEB-INF/views/welcome.jsp");
//
//        } else {
//
//            request.setAttribute("errorMessage", "Invalid Credentials!!");
//            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

        request.getSession().setAttribute("name", name);
        request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
        }
    }

