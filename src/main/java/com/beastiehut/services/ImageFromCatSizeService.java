package com.beastiehut.services;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

// It was used for random images adding to Cats in DB.
// Now image is added depending on color selected.

@Deprecated
public class ImageFromCatSizeService {

    public String getRandomImagePath() {

        Random random = new Random();

        String path = "";
        int randInt = 0;

        Map<Integer, String> pathsMap = new HashMap<>();

        pathsMap.put(1,"/images/random/def_1.jpg");
        pathsMap.put(2,"/images/random/def_2.jpg");
        pathsMap.put(3,"/images/random/def_3.jpeg");
        pathsMap.put(4,"/images/random/def_4.jpg");
        pathsMap.put(5,"/images/random/def_5.jpg");

        for (int i = 1; i < 6; i++) {
            randInt = random.nextInt(i);
        }

        path = pathsMap.get(randInt);

        return path;
    }
}