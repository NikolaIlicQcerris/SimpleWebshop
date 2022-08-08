package com.qcerris.webshop.domain.mapper;

import com.qcerris.webshop.domain.dto.CategoryDTO;
import com.qcerris.webshop.domain.entity.CategoryEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    CategoryDTO categoryToDTO(CategoryEntity category);
    List<CategoryDTO> categoryToDTO(List<CategoryEntity> categoryEntityList);

    CategoryEntity categoryDTOToEntity(CategoryDTO categoryDTO);
    List<CategoryEntity> categoryDTOToEntity(List<CategoryDTO> categoryDTOList);

}
