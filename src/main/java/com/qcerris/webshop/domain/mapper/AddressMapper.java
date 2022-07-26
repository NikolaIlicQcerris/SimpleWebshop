package com.qcerris.webshop.domain.mapper;

import com.qcerris.webshop.domain.dto.AddressDTO;
import com.qcerris.webshop.domain.entity.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    AddressDTO addressToDTO(Address address);
    Address addressDTOToEntity(AddressDTO addressDTO);
}
