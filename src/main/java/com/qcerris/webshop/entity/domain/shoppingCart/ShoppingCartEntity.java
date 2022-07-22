package com.qcerris.webshop.entity.domain.shoppingCart;

import com.qcerris.webshop.entity.domain.BaseEntity;
import com.qcerris.webshop.entity.domain.user.UserEntity;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "shopping_cart")
public class ShoppingCartEntity extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private ShoppingCartStatus status;

    @Column(name = "price")
    private Double price;

    @ManyToOne(fetch = FetchType.LAZY)
    private UserEntity user;

}
