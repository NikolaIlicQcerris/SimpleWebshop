package com.qcerris.webshop.domain.dto;

import com.qcerris.webshop.domain.entity.PaypalAccountEntity;
import com.qcerris.webshop.domain.entity.ShoppingCartEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private Long id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private PaypalAccountEntity paypalAccount;
    private List<ShoppingCartEntity> shoppingCarts;
}
