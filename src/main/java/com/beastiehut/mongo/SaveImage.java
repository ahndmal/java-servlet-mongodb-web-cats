package com.beastiehut.mongo;

import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;

import com.mongodb.*;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;

/**
 * Java MongoDB : Save image example
 *
 */
public class SaveImage {

    public void saveImageToDatabase(String imageName) {

        try {

//            MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
//            DB database = mongoClient.getDB("cats");
//            DBCollection collection = database.getCollection("family");

            File imageFile = new File("D:\\_design\\images\\mongoImage.png");

            GridFS gfsPhoto = new GridFS(new DBConnector().getMongoDB("cats"), "photo");

            GridFSInputFile gfsFile = gfsPhoto.createFile(imageFile);

            gfsFile.setFilename(imageName);

            gfsFile.save();

        } catch (MongoException | IOException e) {
            e.printStackTrace();
        }
    }
    public void saveImageToFileSystem(String imageName) {

        try {

            GridFS gfsPhoto = new GridFS(new DBConnector().getMongoDB("cats"), "photo");

            GridFSDBFile imageForOutput = gfsPhoto.findOne(imageName);

            imageForOutput.writeTo("D:\\_design\\images\\newMongoImage.png");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}