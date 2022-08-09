package com.qcerris.webshop.domain.mapper;

import com.qcerris.webshop.domain.dto.ProductDTO;
import com.qcerris.webshop.domain.entity.ProductEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductDTO productToDTO(ProductEntity product);
    List<ProductDTO> productToDTO(List<ProductEntity> productEntityList);

    ProductEntity productDTOToEntity(ProductDTO productDTO);
    List<ProductEntity> productDTOToEntity(List<ProductDTO> productDTOList);
}
