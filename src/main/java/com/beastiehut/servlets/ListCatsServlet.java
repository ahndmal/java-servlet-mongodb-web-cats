package com.beastiehut.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/list-cats.do")
public class ListCatsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)      throws IOException, ServletException {

        request.getRequestDispatcher("/WEB-INF/views/cat.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)     throws IOException, ServletException {

        request.getRequestDispatcher("/WEB-INF/views/cat.jsp").forward(request, response);
    }
}