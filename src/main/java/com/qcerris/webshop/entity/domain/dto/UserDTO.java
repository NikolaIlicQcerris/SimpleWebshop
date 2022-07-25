package com.qcerris.webshop.entity.domain.dto;

import com.qcerris.webshop.entity.domain.paypalAccount.PaypalAccountEntity;
import com.qcerris.webshop.entity.domain.shoppingCart.ShoppingCartEntity;
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
