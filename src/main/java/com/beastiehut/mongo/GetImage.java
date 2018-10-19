package com.beastiehut.mongo;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;

import java.io.IOException;
import java.net.UnknownHostException;

public class GetImage {

    public GridFSDBFile getImageForOutput(String imageName) throws IOException {

        GridFS gfsPhoto = new GridFS(new DBConnector().getMongoDB("cats"), "photo");

        GridFSDBFile imageForOutput = gfsPhoto.findOne(imageName);

        return imageForOutput;
    }
}