package com.akysoft.todoapp.controllers;

import com.akysoft.todoapp.dtos.UserDto;
import com.akysoft.todoapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {
    @Autowired
    private UserService _userService;

    @PostMapping
    public UserDto create(@RequestBody UserDto dto) throws Exception {
        return _userService.addUser(dto);
    }
}
