package com.akysoft.todoapp.dtos.authModels;

public class LoginRequest {
    public String userName;
    public String password;

    public LoginRequest() {
    }

    public LoginRequest(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
