package com.akysoft.todoapp.repositories;

import com.akysoft.todoapp.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


public interface UserRepository extends JpaRepository<UserEntity, UUID> {
    UserEntity findByUserName(String userName);

    UserEntity findFirstByUserNameAndPassword(String username, String password)
}
