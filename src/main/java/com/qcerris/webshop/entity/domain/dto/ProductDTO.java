package com.qcerris.webshop.entity.domain.dto;

import com.qcerris.webshop.entity.domain.category.CategoryEntity;
import com.qcerris.webshop.entity.domain.item.ItemEntity;
import lombok.Data;

import javax.persistence.*;
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
