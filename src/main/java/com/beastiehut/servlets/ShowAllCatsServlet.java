package com.beastiehut.servlets;

import com.beastiehut.mongo.DBConnector;
import com.mongodb.DBObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/show-all-cats.do")
public class ShowAllCatsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/WEB-INF/views/all_cats.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        DBConnector connector = new DBConnector();

//        List catsNames = new ArrayList();
//        List catsAge = new ArrayList();
//        List catsColors = new ArrayList();
        List cats = new ArrayList();

        for( DBObject cat : connector.getCollectionName().find() ) {

            cats.add(cat);
        }

        request.setAttribute("cats", cats);

        request.getRequestDispatcher("/WEB-INF/views/all_cats.jsp").forward(request, response);
    }
}