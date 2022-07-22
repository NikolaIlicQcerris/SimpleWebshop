package com.qcerris.webshop.entity.domain.item;

import com.qcerris.webshop.entity.domain.BaseEntity;
import com.qcerris.webshop.entity.domain.product.ProductEntity;
import com.qcerris.webshop.entity.domain.shoppingCart.ShoppingCartEntity;
import com.qcerris.webshop.entity.domain.user.UserEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "item")
public class ItemEntity extends BaseEntity {

    private Integer quantity;

    private Double price;

    @ManyToOne(fetch = FetchType.LAZY)
    private ShoppingCartEntity shoppingCart;

    @ManyToOne(fetch = FetchType.LAZY)
    private ProductEntity product;
}
