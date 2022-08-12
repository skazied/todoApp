package com.akysoft.todoapp.services;

import com.akysoft.todoapp.dtos.UserDto;
import com.akysoft.todoapp.entities.UserEntity;
import com.akysoft.todoapp.repositories.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository _userRepository;

    @Override
    public UserDto addUser(UserDto dto) throws Exception {
        if (_userRepository.findByUserName(dto.userName) != null)
            throw new Exception("same user name recorded already");
        UserEntity entity = new UserEntity(dto.userName, encryptWithCaesar(dto.password, dto.userName.length()), dto.name, dto.lastName);
        entity = _userRepository.save(entity);
        return new UserDto(entity.getId(), entity.getUserName(), entity.getPassword(), entity.getName(), entity.getLastName());
    }

    @Override
    public Boolean checkUsernameAndPassword(String userName, String password) {
        UserEntity entity = _userRepository.findFirstByUserNameAndPassword(userName, encryptWithCaesar(password,userName.length()));
        return entity != null;
    }

    private String encryptWithCaesar(String textToEncrypt, int offset) {
        StringBuilder result = new StringBuilder();
        for (char character : textToEncrypt.toCharArray()) {
            if (character != ' ') {
                int originalAlphabetPosition = character - 'a';
                int newAlphabetPosition = (originalAlphabetPosition + offset) % 26;
                char newCharacter = (char) ('a' + newAlphabetPosition);
                result.append(newCharacter);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }
}
