package com.qcerris.webshop.domain.dto;

import com.qcerris.webshop.domain.entity.ProductEntity;
import com.qcerris.webshop.domain.entity.ShoppingCartEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class ItemDTO {

    private Long id;
    private Integer quantity;
    private Double price;
    private ShoppingCartEntity shoppingCart;
    private ProductEntity product;


}
