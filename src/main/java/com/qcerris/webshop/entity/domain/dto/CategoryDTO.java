package com.qcerris.webshop.entity.domain.dto;

import com.qcerris.webshop.entity.domain.product.ProductEntity;
import lombok.Data;

import java.util.Set;

@Data
public class CategoryDTO {

    private Long id;
    private String name;
    private Set<ProductEntity> posts;
}
