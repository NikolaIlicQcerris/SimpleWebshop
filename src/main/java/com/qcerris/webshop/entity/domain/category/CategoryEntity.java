package com.qcerris.webshop.entity.domain.category;

import com.qcerris.webshop.entity.domain.BaseEntity;
import com.qcerris.webshop.entity.domain.product.ProductEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "category")
public class CategoryEntity extends BaseEntity {

    private String name;

    @ManyToMany(mappedBy = "categories")
    private Set<ProductEntity> posts;


}
