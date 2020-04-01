package com.anma.mongo;

import com.mongodb.*;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class DBConnector {

    public MongoClient getMongoClient() throws UnknownHostException {

        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));

        return mongoClient;
    }

    public DB getMongoDB(String databaseName) throws UnknownHostException {

        DB database = new DBConnector().getMongoClient().getDB(databaseName);

        return database;
    }

    public DBCollection getCollectionName() throws UnknownHostException {

        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));

        DB database = mongoClient.getDB("cats");

        return database.getCollection("family");
    }

    public List findCatbyName(String name) throws UnknownHostException {

        BasicDBObject searchQuery = new BasicDBObject();

        List catList = new ArrayList();

        searchQuery.put("name", name);

        DBCursor cursor = new DBConnector().getCollectionName().find(searchQuery);

        while (cursor.hasNext()) {

            catList.add(cursor.next());
        }

        return catList;
    }

    public List findCatByAge(String age) throws UnknownHostException {

        BasicDBObject searchQuery = new BasicDBObject();

        List catList = new ArrayList();

        searchQuery.put("age", age);

        DBCursor cursor = new DBConnector().getCollectionName().find(searchQuery);

        while (cursor.hasNext()) {

            catList.add(cursor.next());
        }

        return catList;
    }

    public List findCatbyColor (String color) throws UnknownHostException {

        BasicDBObject searchQuery = new BasicDBObject();

        List catList = new ArrayList();

        searchQuery.put("color", color);

        DBCursor cursor = new DBConnector().getCollectionName().find(searchQuery);

        while (cursor.hasNext()) {

            catList.add(cursor.next());
        }

        return catList;
    }

    public List findCatbyNameAge (String name, String age) throws UnknownHostException {

        BasicDBObject searchQuery = new BasicDBObject();

        List catList = new ArrayList();

        searchQuery.put("name", name);
        searchQuery.put("age", age);

        DBCursor cursor = new DBConnector().getCollectionName().find(searchQuery);

        while (cursor.hasNext()) {

            catList.add(cursor.next());
        }

        return catList;
    }

    public List findCatbyAgeColor (String age, String color) throws UnknownHostException {

        BasicDBObject searchQuery = new BasicDBObject();

        List catList = new ArrayList();

        searchQuery.put("age", age);
        searchQuery.put("color", color);

        DBCursor cursor = new DBConnector().getCollectionName().find(searchQuery);

        while (cursor.hasNext()) {

            catList.add(cursor.next());
        }

        return catList;
    }

    public List findCatbyNameColor (String name, String color) throws UnknownHostException {

        BasicDBObject searchQuery = new BasicDBObject();

        List catList = new ArrayList();

        searchQuery.put("name", name);
        searchQuery.put("color", color);

        DBCursor cursor = new DBConnector().getCollectionName().find(searchQuery);

        while (cursor.hasNext()) {

            catList.add(cursor.next());
        }

        return catList;
    }

    public List findCatbyNameAgeColor (String name, String age, String color) throws UnknownHostException {

        BasicDBObject searchQuery = new BasicDBObject();

        List catList = new ArrayList();

        searchQuery.put("name", name);
        searchQuery.put("age", age);
        searchQuery.put("color", color);

        DBCursor cursor = new DBConnector().getCollectionName().find(searchQuery);

        while (cursor.hasNext()) {

            catList.add(cursor.next());
        }

        return catList;
    }


    public List getCollectionItems() throws UnknownHostException {

        return new DBConnector().getCollectionName().find().toArray();
    }

    public void addCat(String name, String age, String color, String imagePath) throws UnknownHostException {

        BasicDBObject cat = new BasicDBObject();

        cat.put("name", name);
        cat.put("age", age);
        cat.put("color", color);
        cat.put("imagePath", imagePath);

        new DBConnector().getCollectionName().insert(cat);
    }
}