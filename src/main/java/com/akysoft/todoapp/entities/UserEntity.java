package com.akysoft.todoapp.entities;

import javax.persistence.Entity;

@Entity
public class UserEntity extends BaseEntity{
    private String userName;
    private String password;
    private String name;
    private String lastName;

    public UserEntity(String userName, String password, String name, String lastName) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
    }

    public UserEntity() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
