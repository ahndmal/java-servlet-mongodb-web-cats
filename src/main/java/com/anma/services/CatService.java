//package com.anma.services;
//
//import com.beastiehut.cats.Cat;
//import com.beastiehut.cats.Todo;
//import com.mongodb.BasicDBObject;
//import com.mongodb.DBObject;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class CatService {
//
//    Cat cat;
//
//    private static List cats = new ArrayList();
//
//    static {
//        cats.add(new Todo("Learn Web Application"));
//        cats.add(new Todo("Learn Spring"));
//        cats.add(new Todo("Learn Spring MVC"));
//    }
//
//    public List retrieveTodos() {
//        return cats;
//    }
//
//    public void addTodo(String todo) {
//        cats.add(new Todo(todo));
//    }
//
//    public void deleteTodo(String todo) {
//        cats.remove(new Todo(todo));
//    }
//}
