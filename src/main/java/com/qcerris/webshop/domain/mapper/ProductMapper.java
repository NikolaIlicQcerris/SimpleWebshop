package com.qcerris.webshop.domain.mapper;

import com.qcerris.webshop.domain.dto.ProductDTO;
import com.qcerris.webshop.domain.entity.ProductEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductDTO productToDTO(ProductEntity product);

    ProductEntity productDTOToEntity(ProductDTO productDTO);
}
