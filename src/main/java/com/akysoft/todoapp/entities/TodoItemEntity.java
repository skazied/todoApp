package com.akysoft.todoapp.entities;

import javax.persistence.Entity;
import java.util.Date;
import java.util.UUID;

@Entity
public class TodoItemEntity extends BaseEntity {
    private String text;
    private int status;

    public TodoItemEntity(String text, int status, UUID id, Date createdDate, Date modifyDate, UUID creatorUserId, boolean isActive) {
        this.id = id;
        this.createdDate = createdDate;
        this.modifyDate = modifyDate;
        this.creatorUserId = creatorUserId;
        this.isActive = isActive;
        this.text = text;
        this.status = status;
    }

    public TodoItemEntity(String text, int status) {
        this.text = text;
        this.status = status;
    }

    public TodoItemEntity() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
