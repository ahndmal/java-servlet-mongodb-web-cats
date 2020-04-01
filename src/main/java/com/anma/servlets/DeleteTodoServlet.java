//package com.anma.servlets;
//
//import java.io.IOException;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebServlet(urlPatterns = "/delete-todo.do")
//public class DeleteTodoServlet extends HttpServlet {
//
//    private static final long serialVersionUID = 1L;
//
//    private TodoService todoService = new TodoService();
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//
//        todoService.deleteTodo(request.getParameter("todo"));
//
//    }
//}