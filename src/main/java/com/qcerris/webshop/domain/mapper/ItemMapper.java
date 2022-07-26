package com.qcerris.webshop.domain.mapper;

import com.qcerris.webshop.domain.dto.ItemDTO;
import com.qcerris.webshop.domain.entity.ItemEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemMapper {

    ItemDTO itemToDTO(ItemEntity item);

    ItemEntity itemDTOToEntity(ItemDTO itemDTO);
}
