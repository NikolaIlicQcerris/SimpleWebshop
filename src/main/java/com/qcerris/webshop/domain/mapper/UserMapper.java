package com.qcerris.webshop.domain.mapper;

import com.qcerris.webshop.domain.dto.UserDTO;
import com.qcerris.webshop.domain.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO userEntityToDTO(UserEntity user);
    UserEntity userDTOToEntity(UserDTO userDTO);
}
