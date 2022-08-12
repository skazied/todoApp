package com.akysoft.todoapp.dtos;

import java.util.UUID;

public class UserDto {
    public UUID id;
    public String userName;
    public String password;
    public String name;
    public String lastName;

    public UserDto(UUID id, String userName, String password, String name, String lastName) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
    }

    public UserDto() {
    }
}
