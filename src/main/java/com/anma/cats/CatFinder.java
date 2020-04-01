package com.anma.cats;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CatFinder {

    private Cat cat;

    public DBObject findCat() throws IOException {



        String criteria = "";
        String searchQuery = "";



        DBObject query = new BasicDBObject(criteria, searchQuery);

        return query;
    }
}