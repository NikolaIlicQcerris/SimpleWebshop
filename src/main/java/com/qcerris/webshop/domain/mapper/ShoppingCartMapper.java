package com.qcerris.webshop.domain.mapper;

import com.qcerris.webshop.domain.dto.ShoppingCartDTO;
import com.qcerris.webshop.domain.entity.ShoppingCartEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ShoppingCartMapper {

    ShoppingCartDTO shoppingCartToDTO(ShoppingCartEntity shoppingCart);

    ShoppingCartEntity shoppingCartDTOToEntity(ShoppingCartDTO shoppingCartDTO);
}
