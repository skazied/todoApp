package com.akysoft.todoapp.controllers;

import com.akysoft.todoapp.dtos.TodoItemDto;
import com.akysoft.todoapp.services.TodoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/api/todoItem")
public class TodoItemController {

    @Autowired
    private TodoItemService _todoItemService;

    @GetMapping
    public List<TodoItemDto> getAll(){
        return _todoItemService.getAll();
    }

    @PostMapping
    public TodoItemDto create(@RequestBody TodoItemDto dto){
        return _todoItemService.save(dto);
    }

    @PutMapping
    public TodoItemDto update(@RequestBody TodoItemDto dto){
        return _todoItemService.update(dto);
    }

    @DeleteMapping(value = "/{id}")
    public void getAll(@PathVariable UUID id){
        _todoItemService.deleteById(id);
    }
}
