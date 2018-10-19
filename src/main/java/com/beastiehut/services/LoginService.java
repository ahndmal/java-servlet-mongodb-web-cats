package com.beastiehut.services;

public class LoginService {

    public boolean validateUser(String user, String password) {

        if(user.equalsIgnoreCase("AndriiM") && password.equalsIgnoreCase("porkie")) {

            return true;
        }
        return false;
    }
}