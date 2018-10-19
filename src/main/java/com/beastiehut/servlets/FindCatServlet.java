package com.beastiehut.servlets;

import com.beastiehut.mongo.DBConnector;
import com.beastiehut.mongo.GetImage;
import com.beastiehut.services.ImageFromCatSizeService;
import com.mongodb.gridfs.GridFSDBFile;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/find-cat.do")
public class FindCatServlet extends HttpServlet {

    private GetImage getImage = new GetImage();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IllegalStateException {

        request.getRequestDispatcher("/WEB-INF/views/find_cat.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("cat_name");
        String age = request.getParameter("cat_age");
        String color = request.getParameter("cat_color");

        List catsName = new DBConnector().findCatbyName(name);
        List catsAge = new DBConnector().findCatByAge(age);
        List catsColor = new DBConnector().findCatbyColor(color);
        List catsNameAge = new DBConnector().findCatbyNameAge(name, age);
        List catsAgeColor = new DBConnector().findCatbyAgeColor(age, color);
        List catsNameColor = new DBConnector().findCatbyNameColor(name, color);
        List catsNameAgeColor = new DBConnector().findCatbyNameAgeColor(name, age, color);

//        GridFSDBFile foundImage = getImage.getImageForOutput(name);

//        request.setAttribute("foundImage", foundImage);

        request.setAttribute("catsName", catsName);
        request.setAttribute("catsAge", catsAge);
        request.setAttribute("catsColor", catsColor);
        request.setAttribute("catsNameAge", catsNameAge);
        request.setAttribute("catsAgeColor", catsAgeColor);
        request.setAttribute("catsNameColor", catsNameColor);
        request.setAttribute("catsNameAgeColor", catsNameAgeColor);

        request.getRequestDispatcher("/WEB-INF/views/find_cat.jsp").forward(request, response);
    }
}