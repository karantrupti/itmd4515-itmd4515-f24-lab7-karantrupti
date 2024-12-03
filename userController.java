package com.example.lab7;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class UserController {

    private String username;
    private String password;

    public String login() {
        // Simulate login logic (validate user credentials)
        if ("admin".equals(username) && "password".equals(password)) {
            return "welcome.xhtml?faces-redirect=true";
        }
        return "error.xhtml?faces-redirect=true";
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
