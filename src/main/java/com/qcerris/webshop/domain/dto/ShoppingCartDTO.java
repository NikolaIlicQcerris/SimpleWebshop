package com.qcerris.webshop.domain.dto;

import com.qcerris.webshop.domain.entity.ItemEntity;
import com.qcerris.webshop.domain.entity.UserEntity;
import com.qcerris.webshop.domain.entity.enums.ShoppingCartStatus;
import lombok.Data;

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
