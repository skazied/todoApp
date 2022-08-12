package com.akysoft.todoapp.entities;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue
    protected UUID id;

    @CreatedDate
    protected Date createdDate;

    @LastModifiedDate
    protected Date modifyDate;

    protected UUID creatorUserId;
    protected boolean isActive;

    public BaseEntity(UUID id, Date createdDate, Date modifyDate, UUID creatorUserId, boolean isActive) {
        this.id = id;
        this.createdDate = createdDate;
        this.modifyDate = modifyDate;
        this.creatorUserId = creatorUserId;
        this.isActive = isActive;
    }

    public BaseEntity() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public UUID getCreatorUserId() {
        return creatorUserId;
    }

    public void setCreatorUserId(UUID creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
