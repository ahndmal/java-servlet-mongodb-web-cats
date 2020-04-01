package com.anma.cats;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class CatAdaptor {

    public static final DBObject toDBObject(Cat cat){

        return new BasicDBObject("name", cat.getName())
                        .append("age", cat.getAge())
                        .append("color", cat.getColor());
    }
}