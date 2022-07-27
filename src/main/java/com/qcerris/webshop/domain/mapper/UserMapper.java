package com.qcerris.webshop.domain.mapper;

import com.qcerris.webshop.domain.dto.UserDTO;
import com.qcerris.webshop.domain.entity.UserEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO userEntityToDTO(UserEntity user);
    List<UserDTO> userEntityToDTO(List<UserEntity> userEntityList);

    UserEntity userDTOToEntity(UserDTO userDTO);
    List<UserEntity> userDTOToEntity(List<UserDTO> userDTOList);
}
