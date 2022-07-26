package com.qcerris.webshop.domain.dto;

import com.qcerris.webshop.domain.entity.CategoryEntity;
import com.qcerris.webshop.domain.entity.ItemEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class ProductDTO {

    private Long id;
    private String name;
    private Double price;
    private Integer quantity;
    private List<ItemEntity> items;
    private Set<CategoryEntity> categories;

}
