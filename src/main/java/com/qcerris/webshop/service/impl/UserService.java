package com.qcerris.webshop.service.impl;

import com.qcerris.webshop.domain.dto.UserDTO;
import com.qcerris.webshop.domain.entity.UserEntity;
import com.qcerris.webshop.domain.mapper.MapStructMapper;
import com.qcerris.webshop.repository.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    private final MapStructMapper mapstructMapper;
    private final UserRepository userRepository;

    public UserService(MapStructMapper mapstructMapper, UserRepository userRepository) {
        this.mapstructMapper = mapstructMapper;
        this.userRepository = userRepository;
    }

    public UserDTO insertNewUser(UserDTO userDTO) {

        UserEntity savedUser = userRepository.save(mapstructMapper.userDTOToEntity(userDTO));
        return mapstructMapper.userEntityToDTO(savedUser);
    }

    public UserDTO fetchUserById(Long id) {
        UserEntity entity = userRepository.getReferenceById(id);
        return mapstructMapper.userEntityToDTO(entity);
    }

    public UserDTO fetchUserByUsername(String username) {
        return mapstructMapper.userEntityToDTO(userRepository.findByUsername(username));
    }

    public String deleteUserById(Long id) {
        UserEntity toBeDeleted = userRepository.getReferenceById(id);
        userRepository.delete(toBeDeleted);
        return "Successfully deleted user: " + toBeDeleted.getUsername();
    }
}
