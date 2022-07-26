package com.qcerris.webshop.domain.dto;

import com.qcerris.webshop.domain.entity.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class CategoryDTO {

    private Long id;
    private String name;
    private Set<ProductEntity> posts;
}
