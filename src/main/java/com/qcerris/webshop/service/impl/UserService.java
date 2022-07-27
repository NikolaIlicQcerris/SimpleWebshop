package com.qcerris.webshop.service.impl;

import com.qcerris.webshop.domain.dto.UserDTO;
import com.qcerris.webshop.domain.entity.UserEntity;
import com.qcerris.webshop.domain.mapper.UserMapper;
import com.qcerris.webshop.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;

    public UserService(UserMapper userMapper, UserRepository userRepository) {
        this.userMapper = userMapper;
        this.userRepository = userRepository;
    }

    public UserDTO insertNewUser(UserDTO userDTO) {

        UserEntity savedUser = userRepository.save(userMapper.userDTOToEntity(userDTO));
        return userMapper.userEntityToDTO(savedUser);
    }

    public UserDTO fetchUserById(Long id) {
        UserEntity entity = userRepository.getReferenceById(id);
        return userMapper.userEntityToDTO(entity);
    }

    public UserDTO fetchUserByUsername(String username) {
        return userMapper.userEntityToDTO(userRepository.findByUsername(username));
    }

    public String deleteUserById(Long id) {
        UserEntity toBeDeleted = userRepository.getReferenceById(id);
        userRepository.delete(toBeDeleted);
        return "Successfully deleted user: " + toBeDeleted.getUsername();
    }

    public List<UserDTO> getAllUsers() {
        List<UserEntity> entityList = userRepository.findAll();
        return userMapper.userEntityToDTO(entityList);
    }
}
