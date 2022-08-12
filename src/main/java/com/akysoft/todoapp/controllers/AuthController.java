package com.akysoft.todoapp.controllers;

import com.akysoft.todoapp.dtos.UserDto;
import com.akysoft.todoapp.dtos.authModels.LoginRequest;
import com.akysoft.todoapp.dtos.authModels.LoginResponse;
import com.akysoft.todoapp.services.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/user")
public class AuthController {
    @Autowired
    private UserService _userService;

    @PostMapping
    public LoginResponse login(@RequestBody LoginRequest loginRequest) {
        return _userService.checkUsernameAndPassword(loginRequest.userName, loginRequest.password);
    }
}
