package com.qcerris.webshop.domain.dto;

import com.qcerris.webshop.domain.entity.CategoryEntity;
import com.qcerris.webshop.domain.entity.ItemEntity;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class ProductDTO {

    private Long id;
    private String name;
    private Double price;
    private Integer quantity;
    private List<ItemEntity> items;
    private Set<CategoryEntity> categories;

}
