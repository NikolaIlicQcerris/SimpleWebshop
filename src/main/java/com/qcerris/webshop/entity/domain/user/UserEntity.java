package com.qcerris.webshop.entity.domain.user;

import com.qcerris.webshop.entity.domain.BaseEntity;
import com.qcerris.webshop.entity.domain.paypalAccount.PaypalAccountEntity;
import com.qcerris.webshop.entity.domain.shoppingCart.ShoppingCartEntity;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity {

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, orphanRemoval = true)
    private PaypalAccountEntity paypalAccount;

    @OneToMany(
            mappedBy = "user",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<ShoppingCartEntity> shoppingCarts;

}
