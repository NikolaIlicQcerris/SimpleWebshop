package com.qcerris.webshop.domain.dto;

import com.qcerris.webshop.domain.entity.ProductEntity;
import com.qcerris.webshop.domain.entity.ShoppingCartEntity;
import lombok.Data;

@Data
public class ItemDTO {

    private Long id;
    private Integer quantity;
    private Double price;
    private ShoppingCartEntity shoppingCart;
    private ProductEntity product;


}
