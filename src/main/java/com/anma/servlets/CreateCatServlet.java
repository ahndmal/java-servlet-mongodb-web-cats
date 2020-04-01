package com.anma.servlets;

import com.anma.mongo.DBConnector;
import com.anma.mongo.SaveImage;
import com.anma.services.CatCreationService;
import com.anma.services.ImageFromCatSizeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/create-cat.do")
public class CreateCatServlet extends HttpServlet {

    private CatCreationService catCreationService = new CatCreationService();
    private SaveImage saveImage = new SaveImage();
    private DBConnector connector = new DBConnector();
    private ImageFromCatSizeService imageFromCatSizeService = new ImageFromCatSizeService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/WEB-INF/views/create_cat.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NumberFormatException {

        try {

            String catName = request.getParameter("cat_name");
            String catAge = request.getParameter("cat_age");
            String catColor = request.getParameter("cat_color");
            String imagePath = "";

            if (catColor.equals("Black")) {
                imagePath = "/images/colors/black.jpg";
            } else if (catColor.equals("Grey")) {
                imagePath = "/images/colors/grey.jpg";
            } else if (catColor.equals("Red")) {
                imagePath = "/images/colors/red.jpg";
            } else if (catColor.equals("Three-Color")) {
                imagePath = "/images/colors/three-color.jpg";
            } else if (catColor.equals("White")) {
                imagePath = "/images/colors/white.jpg";
            } else if (catColor.equals("White and Grey")) {
                imagePath = "/images/colors/white_and_grey.jpg";
            }

            boolean isValidCat = catCreationService.validateCatCreation(catName, catAge, catColor);

            if (isValidCat) {

                connector.addCat(catName, catAge, catColor, imagePath); // put cat into DB

//                saveImage.saveImageToDatabase(catName);// put image in MongoDB
//                saveImage.saveImageToFileSystem(catName); // put image into File System

                String success = "Cat successfully created!";

                request.setAttribute("success", success);
                request.getRequestDispatcher("/WEB-INF/views/create_cat.jsp").forward(request, response);

            } else {

                String catCreationError = "Please specify all the fields!";
                request.setAttribute("catCreationError", catCreationError);
//                response.sendRedirect("/create-cat.do");
                request.getRequestDispatcher("/WEB-INF/views/create_cat.jsp").forward(request, response);
            }
        } catch (NumberFormatException | IllegalStateException | NullPointerException e) {

            String catCreationError = "Please specify all the fields!";
            request.setAttribute("catCreationError", catCreationError);
            request.getRequestDispatcher("/WEB-INF/views/create_cat.jsp").forward(request, response);
        }

//        if (new DBConnector().findCatbyName(catName).contains(catName)) {
//            String success = "Cat successfully created";
//            request.setAttribute("success", success);
//        }

        request.getRequestDispatcher("/WEB-INF/views/create_cat.jsp").forward(request, response);
    }
}