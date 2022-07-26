package com.qcerris.webshop.domain.mapper;

import com.qcerris.webshop.domain.dto.CategoryDTO;
import com.qcerris.webshop.domain.entity.CategoryEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    CategoryDTO categoryToDTO(CategoryEntity category);
    CategoryEntity categoryDTOToEntity(CategoryDTO categoryDTO);

}
