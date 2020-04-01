package com.anma.mongo;

import com.mongodb.gridfs.GridFS;

import java.net.UnknownHostException;

public class DeleteImage {

    public void deleteImageInDB() throws UnknownHostException {

        String newFileName = "mkyong-java-image";

        GridFS gfsPhoto = new GridFS(new DBConnector().getMongoDB("cats"), "photo");

        gfsPhoto.remove(gfsPhoto.findOne(newFileName));
    }
}