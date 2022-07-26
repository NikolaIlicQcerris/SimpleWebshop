package com.qcerris.webshop.domain.dto;

import com.qcerris.webshop.domain.entity.PaypalAccountEntity;
import com.qcerris.webshop.domain.entity.ShoppingCartEntity;
import lombok.Data;

import java.util.List;

@Data
public class UserDTO {

    private Long id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private PaypalAccountEntity paypalAccount;
    private List<ShoppingCartEntity> shoppingCarts;
}
