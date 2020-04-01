package com.anma.mongo;

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