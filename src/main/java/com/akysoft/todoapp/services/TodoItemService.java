package com.akysoft.todoapp.services;

import com.akysoft.todoapp.dtos.TodoItemDto;

import java.util.List;
import java.util.UUID;

public interface TodoItemService {
    TodoItemDto save(TodoItemDto itemDto);
    TodoItemDto update(TodoItemDto itemDto);
    List<TodoItemDto> getAll();
    void deleteById(UUID id);
}
