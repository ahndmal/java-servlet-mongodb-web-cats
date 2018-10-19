package com.beastiehut.services;

public class CatCreationService {

    public boolean validateCatCreation(String catName, String catAge, String catColor) {

        if (!catName.isEmpty() && !catAge.isEmpty() && !catColor.isEmpty()) {

            return true;
        }
        return false;
    }
}