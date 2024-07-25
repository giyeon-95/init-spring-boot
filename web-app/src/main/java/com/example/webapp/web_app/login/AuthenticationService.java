package com.example.webapp.web_app.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password) {

        boolean isValidUserName = username.equalsIgnoreCase("qwe");
        boolean isValidPassword = password.equalsIgnoreCase("asd");

        return isValidUserName && isValidPassword;
    }
}
