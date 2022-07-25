package com.qcerris.webshop.entity.domain.dto;

import com.qcerris.webshop.entity.domain.item.ItemEntity;
import com.qcerris.webshop.entity.domain.shoppingCart.ShoppingCartStatus;
import com.qcerris.webshop.entity.domain.user.UserEntity;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Data
public class ShoppingCartDTO {

    private Long id;
    private String name;
    private ShoppingCartStatus status;
    private Double price;
    private UserEntity user;
    private List<ItemEntity> items;
}
