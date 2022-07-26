package com.qcerris.webshop.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@NoArgsConstructor
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

    public ItemEntity(Integer quantity, ShoppingCartEntity shoppingCart, ProductEntity product) {
        this.quantity = quantity;
        this.product = product;
        this.shoppingCart = shoppingCart;

        if (product != null)
            this.price = quantity * product.getPrice();
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
        if(this.product!=null)
            this.price = quantity * this.product.getPrice();
    }

    public void setShoppingCart(ShoppingCartEntity shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
        if(this.quantity!=null)
            this.price = this.quantity * product.getPrice();
    }
}
