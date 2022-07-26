package com.qcerris.webshop.domain.dto;

import com.qcerris.webshop.domain.entity.ProductEntity;
import lombok.Data;

import java.util.Set;

@Data
public class CategoryDTO {

    private Long id;
    private String name;
    private Set<ProductEntity> posts;
}
