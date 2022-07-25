package com.qcerris.webshop.service;

import com.qcerris.webshop.entity.domain.dto.UserDTO;
import com.qcerris.webshop.entity.domain.user.UserEntity;
import com.qcerris.webshop.mappers.MapStructMapper;
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
        UserEntity entity=userRepository.getReferenceById(id);
        return mapstructMapper.userEntityToDTO(entity);
    }
}
