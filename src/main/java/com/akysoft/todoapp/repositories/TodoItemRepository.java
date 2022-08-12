package com.akysoft.todoapp.repositories;

import com.akysoft.todoapp.entities.TodoItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


public interface TodoItemRepository extends JpaRepository<TodoItemEntity, UUID> {

}
