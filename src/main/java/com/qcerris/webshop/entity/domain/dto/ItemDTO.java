package com.qcerris.webshop.entity.domain.dto;

import com.qcerris.webshop.entity.domain.product.ProductEntity;
import com.qcerris.webshop.entity.domain.shoppingCart.ShoppingCartEntity;
import lombok.Data;

@Data
public class ItemDTO {

    private Long id;
    private Integer quantity;
    private Double price;
    private ShoppingCartEntity shoppingCart;
    private ProductEntity product;


}
