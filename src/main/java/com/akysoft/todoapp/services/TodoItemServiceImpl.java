package com.akysoft.todoapp.services;

import com.akysoft.todoapp.dtos.TodoItemDto;
import com.akysoft.todoapp.entities.TodoItemEntity;
import com.akysoft.todoapp.repositories.TodoItemRepository;
import com.akysoft.todoapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class TodoItemServiceImpl implements TodoItemService {

    @Autowired
    private TodoItemRepository _todoItemRepository;

    @Override
    public TodoItemDto save(final TodoItemDto itemDto) {
        TodoItemEntity entity = new TodoItemEntity(itemDto.text, itemDto.status);
        entity = _todoItemRepository.save(entity);
        return new TodoItemDto(entity.getId(), entity.getText(), entity.getCreatedDate(), itemDto.status);
    }

    @Override
    public TodoItemDto update(final TodoItemDto itemDto) {
        TodoItemEntity entity = new TodoItemEntity(itemDto.text, itemDto.status);
        entity = _todoItemRepository.save(entity);
        return new TodoItemDto(entity.getId(), entity.getText(), entity.getCreatedDate(), itemDto.status);
    }

    @Override
    public List<TodoItemDto> getAll() {
        return _todoItemRepository
                    .findAll()
                    .stream()
                    .map(x -> new TodoItemDto(x.getId(), x.getText(), x.getCreatedDate(), x.getStatus()))
                    .collect(Collectors.toList());
    }

    @Override
    public void deleteById(UUID id) {
        _todoItemRepository.deleteById(id);
    }
}
