package com.akysoft.todoapp.services;

import com.akysoft.todoapp.dtos.UserDto;

public interface UserService {
    UserDto addUser(UserDto dto) throws Exception;
    Boolean checkUsernameAndPassword(String userName, String password);
}
