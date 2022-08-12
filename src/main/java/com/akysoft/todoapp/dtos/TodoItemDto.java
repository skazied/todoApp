package com.akysoft.todoapp.dtos;

import java.util.Date;
import java.util.UUID;

public class TodoItemDto {

    public String text;
    public int status;
    public UUID id;
    protected Date createdDate;

    public TodoItemDto(UUID id, String text, Date createdDate,int status) {
        this.id = id;
        this.text = text;
        this.createdDate = createdDate;
        this.status = status;
    }

    public TodoItemDto() {
    }
}
